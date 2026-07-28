package com.academy.atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATMService {
    private static final int MAX_PIN_ATTEMPTS = 3;
    private static final String TRANSACTION_FILE = "transactions.txt";

    private final Map<String, Account> accounts = new HashMap<>();
    private final List<Transaction> sessionTransactions = new ArrayList<>();
    private final Scanner scanner;

    private Account loggedInAccount;
    private int pinAttemptsRemaining = MAX_PIN_ATTEMPTS;

    public ATMService(Scanner scanner) {
        this.scanner = scanner;
        initializeAccounts();
    }

    private void initializeAccounts() {
        accounts.put("1001", new Account("1001", "John Smith", "1234", 11000));
        accounts.put("1002", new Account("1002", "Alice Johnson", "5678", 5000));
    }

    private Account findAccount(String accountNumber) throws AccountNotFoundException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }
        return account;
    }

    private void printReturnMessage() {
        System.out.println("Transaction Completed.");
        System.out.println("Returning to Main Menu.");
    }

    public void login() {
        if (loggedInAccount != null) {
            System.out.println("Already logged in as " + loggedInAccount.getCustomerName() + ".");
            return;
        }

        System.out.print("Enter Account Number : ");
        String accountNumber = scanner.nextLine().trim();

        try {
            Account account = findAccount(accountNumber);
            System.out.print("Enter PIN : ");
            String pin = scanner.nextLine().trim();

            if (!account.getPin().equals(pin)) {
                pinAttemptsRemaining--;
                throw new InvalidPinException("Invalid PIN entered.", pinAttemptsRemaining);
            }

            loggedInAccount = account;
            pinAttemptsRemaining = MAX_PIN_ATTEMPTS;
            System.out.println("Login Successful");
            LoggerUtil.logInfo("Login successful for account " + accountNumber);
        } catch (AccountNotFoundException | InvalidPinException ex) {
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            LoggerUtil.logError(ex.getMessage(), ex);

            if (ex instanceof InvalidPinException invalidPin && invalidPin.getAttemptsRemaining() <= 0) {
                System.out.println("Maximum PIN attempts reached. Login locked for this session.");
            }
        } finally {
            printReturnMessage();
        }
    }

    public void logout() {
        if (loggedInAccount != null) {
            LoggerUtil.logInfo("Logout for account " + loggedInAccount.getAccountNumber());
            loggedInAccount = null;
        }
    }

    @FunctionalInterface
    private interface TransactionAction {
        void run() throws Exception;
    }

    private void requireLogin() throws InvalidPinException {
        if (loggedInAccount == null) {
            throw new InvalidPinException("Please loging before performing this operation.", pinAttemptsRemaining);
        }
    }

    private double readAmount(String prompt) throws InputMismatchException {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            throw new InputMismatchException("Invalid numeric input.");
        }
    }

    private void recordTransaction(String type, double amount, boolean successful, String details) {
        if (loggedInAccount == null) {
            return;
        }
        sessionTransactions.add(
                new Transaction(loggedInAccount.getAccountNumber(), type, amount, successful, details));
    }

    private void recordFailedTransaction(String operationName, String message) {
        String accountNumber = loggedInAccount != null ? loggedInAccount.getAccountNumber() : "UNKNOWN";
        sessionTransactions.add(
                new Transaction(accountNumber, operationName.toUpperCase(), 0, false, message));
    }

    private void executeTransaction(String operationName, TransactionAction action) {
        long startTime = System.nanoTime();
        try {
            action.run();
            LoggerUtil.logTransaction(operationName + " completed successfully", (System.nanoTime() - startTime / 1_000_000));
        } catch (InputMismatchException ex) {
            System.out.println("ERROR");
            System.out.println("Invalid numeric input.");
            System.out.println("Please enter a valid amount.");
            LoggerUtil.logError("Invalid numeric input during " + operationName, ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InvalidAmountException ex) {
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            LoggerUtil.logError(ex.getMessage(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InsufficientFundsException ex) {
            System.out.println("ERROR");
            System.out.println("Insufficient Balance");
            System.out.println("Transaction Cancelled");
            LoggerUtil.logError("Requested " + ex.getRequestedAmount() + " Balance " + ex.getAvailableBalance(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (InvalidPinException | AccountNotFoundException ex) {
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            LoggerUtil.logError(ex.getMessage(), ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERROR");
            System.out.println("Unexpected error occurred. Please try again.");
            LoggerUtil.logError("Unexpected error during " + operationName, ex);
            recordFailedTransaction(operationName, ex.getMessage());
        } finally {
            printReturnMessage();
        }
    }

    public void deposit() {
        executeTransaction("Deposit", () -> {
            requireLogin();
            double amount = readAmount("Amount : ");
            loggedInAccount.deposit(amount);
            recordTransaction("DEPOSIT", amount, true, "Deposit successful");
            System.out.println("Deposit Successful");
            System.out.printf("Current Balance : %.0f%n", loggedInAccount.getBalance());
        });
    }

    public void withdraw() {
        executeTransaction("Withdraw", () -> {
            requireLogin();
            double amount = readAmount("Amount : ");
            loggedInAccount.withdraw(amount);
            recordTransaction("WITHDRAW", amount, true, "Withdrawal successful");
            System.out.println("Withdrawal Successful");
            System.out.printf("Current Balance : %.0f%n", loggedInAccount.getBalance());
        });
    }

    public void displayBalance() {
        executeTransaction("Balance Inquiry", () -> {
            requireLogin();
            loggedInAccount.displayBalance();
        });
    }

    public void transferFunds() {
        executeTransaction("Transfer", () -> {
            requireLogin();
            System.out.print("Destination Account Number : ");
            String destinationAccountNumber = scanner.nextLine().trim();
            Account destinationAccount = findAccount(destinationAccountNumber);
            double amount = readAmount("Transfer Amount : ");

            String sourceAccountNumber = loggedInAccount.getAccountNumber();
            double sourceBalanceBefore = loggedInAccount.getBalance();
            double destinationBalanceBefore = destinationAccount.getBalance();

            try {
                loggedInAccount.withdraw(amount);
                destinationAccount.deposit(amount);
                recordTransaction("TRANSFER_OUT", amount, true, "Transfer to " + destinationAccountNumber);
                recordTransaction("TRANSFER_IN", amount, true, "Transfer from " + sourceAccountNumber);
                System.out.println("Transfer Successful");
            } catch (Exception ex) {
                accounts.get(sourceAccountNumber).restoreBalance(sourceBalanceBefore);
                accounts.get(destinationAccountNumber).restoreBalance(destinationBalanceBefore);
                System.out.println("Transfer rolled back due to transaction failure.");
                LoggerUtil.logInfo("Transfer rollback completed for accounts " + sourceAccountNumber + " and " + destinationAccountNumber);
                throw ex; // let executeTransaction log + message
            }
        });
    }

    public void displayMiniStatement() {
        executeTransaction("Mini Statement", () -> {
            requireLogin();
            System.out.println("Session Transactions:");
            sessionTransactions.stream()
                    .filter(t -> loggedInAccount.getAccountNumber().equals(t.getAccountNumber()))
                    .forEach(System.out::println);
            System.out.println();
            System.out.println("Historical Transactions (from file):");
            loadTransactionsFromFile();
        });
    }

    private void loadTransactionsFromFile() {
        try (BufferedReader reader = new BufferedReader((new FileReader(TRANSACTION_FILE)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Unable to read transaction history.");
            LoggerUtil.logError("Unable to read transaction history", ex);
        }
    }

    public void demonstrateUncheckedExceptions() {
        System.out.println("--- Unchecked Exception Demonstrations ---");

        try {
            Account account = null;
            account.getBalance();
        } catch (NullPointerException ex) {
            System.out.println("Handled NullPointerException gracefully.");
            LoggerUtil.logError("NullPointerException demonstration", ex);
        }

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Handled ArithmeticException gracefully.");
            LoggerUtil.logError("ArithmeticException demonstration", ex);
        }

        try {
            int[] values = {1, 2, 3};
            System.out.println(values[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Handled ArrayIndexOutOfBoundsException gracefully.");
            LoggerUtil.logError("ArrayIndexOutOfBoundsException demonstration", ex);
        }
    }

    // BONUS: DAILY ERROR REPORT
    public void displayDailyErrorReport() {
        Path logPath = Path.of("logs", "application.log");
        try {
            if (!Files.exists(logPath)) {
                System.out.println("No log file found yet.");
                return;
            }
            List<String> errorLines = Files.readAllLines(logPath).stream()
                    .filter(line -> line.contains(" ERROR "))
                    .toList();
            System.out.println("Total ERROR entries : " + errorLines.size());
            System.out.println("Most recent errors:");
            errorLines.stream()
                    .skip(Math.max(0, errorLines.size() -5))
                    .forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Unable to read log file.");
            LoggerUtil.logError("Unable to read log file for daily error report", ex);
        }
    }

    // BONUS: TRANSACTION SUMMARY
    public void displayTransactionSummary() {
        long total = sessionTransactions.size();
        long successful = sessionTransactions.stream().filter(Transaction::isSuccessful).count();
        long failed = total - successful;

        System.out.println("Session Transaction Summary");
        System.out.println("Total       : " + total);
        System.out.println("Successful  : " + successful);
        System.out.println("Failed      : " + failed);
    }
}

