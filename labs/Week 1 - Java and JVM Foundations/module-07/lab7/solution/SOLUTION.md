# Lab 7 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-7-GUIDE.md`](../LAB-7-GUIDE.md)

## Goal

**ATM exceptions / try-with-resources**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab7 project, then:
cd Lab7-ATMSystem
# compile/run Main per LAB-7-GUIDE
```

## Complete Java sources (9 files)

### `Lab7-ATMSystem/src/com/academy/atm/Account.java`

```java
package com.academy.atm;

public class Account {

    private final String accountNumber;
    private final String customerName;
    private final String pin;
    private double balance;

    public Account(String accountNumber, String customerName, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    void restoreBalance(double targetBalance) {
        this.balance = targetBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Transaction Failed. Insufficient Account Balance.",
                    amount,
                    balance);
        }

        balance -= amount;
    }

    public void displayBalance() {
        System.out.printf("Account : %s | Customer : %s | Balance : $%.2f%n",
                accountNumber, customerName, balance);
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/AccountNotFoundException.java`

```java
package com.academy.atm;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/ATMService.java`

```java
package com.academy.atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
                recordTransaction("TRANSFER_OUT", amount, true,
                        "Transfer to " + destinationAccountNumber);
                recordTransaction("TRANSFER_IN", amount, true,
                        "Transfer from " + sourceAccountNumber);
                System.out.println("Transfer Successful");
            } catch (Exception ex) {
                accounts.get(sourceAccountNumber).restoreBalance(sourceBalanceBefore);
                accounts.get(destinationAccountNumber).restoreBalance(destinationBalanceBefore);
                System.out.println("Transfer rolled back due to transaction failure.");
                LoggerUtil.logInfo("Transfer rollback completed for accounts "
                        + sourceAccountNumber + " and " + destinationAccountNumber);
                throw ex;
            }
        });
    }

    public void displayMiniStatement() {
        executeTransaction("Mini Statement", () -> {
            requireLogin();
            System.out.println("Session Transactions:");
            sessionTransactions.stream()
                    .filter(transaction -> loggedInAccount.getAccountNumber().equals(transaction.getAccountNumber()))
                    .forEach(System.out::println);

            System.out.println();
            System.out.println("Historical Transactions (from file):");
            loadTransactionsFromFile();
        });
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

    public void generateDailyErrorReport() {
        Path logPath = Path.of("logs", "application.log");
        if (!Files.exists(logPath)) {
            System.out.println("No log file found.");
            return;
        }

        try {
            List<String> lines = Files.readAllLines(logPath);
            long errorCount = lines.stream().filter(line -> line.contains("ERROR")).count();
            System.out.println("Daily Error Report");
            System.out.println("Total log lines : " + lines.size());
            System.out.println("Error entries   : " + errorCount);
            lines.stream()
                    .filter(line -> line.contains("ERROR"))
                    .limit(10)
                    .forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Unable to read log file.");
            LoggerUtil.logError("Failed to generate daily error report", ex);
        }
    }

    public void generateTransactionSummary() {
        System.out.println("Transaction Summary Report");
        long successCount = sessionTransactions.stream().filter(Transaction::isSuccessful).count();
        long failureCount = sessionTransactions.size() - successCount;
        System.out.println("Total transactions : " + sessionTransactions.size());
        System.out.println("Successful         : " + successCount);
        System.out.println("Failed             : " + failureCount);
        sessionTransactions.forEach(System.out::println);
    }

    public void logout() {
        loggedInAccount = null;
    }

    private void executeTransaction(String operationName, TransactionAction action) {
        long startTime = System.nanoTime();
        try {
            action.run();
            LoggerUtil.logTransaction(operationName + " completed successfully",
                    (System.nanoTime() - startTime) / 1_000_000);
        } catch (InputMismatchException ex) {
            scanner.nextLine();
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
            LoggerUtil.logError("Requested " + ex.getRequestedAmount()
                    + " Balance " + ex.getAvailableBalance(), ex);
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

    private void loadTransactionsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Unable to read transaction history.");
            LoggerUtil.logError("Unable to read transaction history", ex);
        }
    }

    private Account findAccount(String accountNumber) throws AccountNotFoundException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }
        return account;
    }

    private void requireLogin() throws InvalidPinException {
        if (loggedInAccount == null) {
            throw new InvalidPinException("Please login before performing this operation.", pinAttemptsRemaining);
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
        sessionTransactions.add(new Transaction(
                loggedInAccount.getAccountNumber(), type, amount, successful, details));
    }

    private void recordFailedTransaction(String type, String details) {
        if (loggedInAccount == null) {
            return;
        }
        sessionTransactions.add(new Transaction(
                loggedInAccount.getAccountNumber(), type, 0, false, details));
    }

    private void printReturnMessage() {
        System.out.println("Transaction Completed.");
        System.out.println("Returning to Main Menu.");
    }

    @FunctionalInterface
    private interface TransactionAction {
        void run() throws Exception;
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/InsufficientFundsException.java`

```java
package com.academy.atm;

public class InsufficientFundsException extends Exception {

    private final double requestedAmount;
    private final double availableBalance;

    public InsufficientFundsException(String message, double requestedAmount, double availableBalance) {
        super(message);
        this.requestedAmount = requestedAmount;
        this.availableBalance = availableBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/InvalidAmountException.java`

```java
package com.academy.atm;

public class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/InvalidPinException.java`

```java
package com.academy.atm;

public class InvalidPinException extends Exception {

    private final int attemptsRemaining;

    public InvalidPinException(String message, int attemptsRemaining) {
        super(message);
        this.attemptsRemaining = attemptsRemaining;
    }

    public int getAttemptsRemaining() {
        return attemptsRemaining;
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/LoggerUtil.java`

```java
package com.academy.atm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public final class LoggerUtil {

    private static final Path LOG_PATH = Path.of("logs", "application.log");
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private LoggerUtil() {
    }

    public static void logInfo(String message) {
        writeLog("INFO", message, null);
    }

    public static void logError(String message, Throwable throwable) {
        writeLog("ERROR", message, throwable);
    }

    public static void logTransaction(String message, long executionTimeMillis) {
        writeLog("INFO", message + " | Execution Time: " + executionTimeMillis + " ms", null);
    }

    private static void writeLog(String level, String message, Throwable throwable) {
        try {
            Files.createDirectories(LOG_PATH.getParent());
            StringBuilder entry = new StringBuilder();
            entry.append(LocalDateTime.now().format(FORMATTER))
                    .append(" ")
                    .append(level)
                    .append(" ")
                    .append(message);

            if (throwable != null) {
                entry.append(System.lineSeparator())
                        .append(throwable.getClass().getSimpleName())
                        .append(" ")
                        .append(throwable.getMessage())
                        .append(System.lineSeparator())
                        .append(Arrays.toString(throwable.getStackTrace()));
            }

            entry.append(System.lineSeparator());
            Files.writeString(LOG_PATH, entry.toString(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ioException) {
            System.err.println("Unable to write log file: " + ioException.getMessage());
        }
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/Main.java`

```java
package com.academy.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMService atmService = new ATMService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid menu option. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid menu option. Please try again.");
                LoggerUtil.logError("Invalid menu option: " + choiceInput, ex);
                continue;
            }

            System.out.println("--------------------------------");

            switch (choice) {
                case 1 -> atmService.login();
                case 2 -> atmService.deposit();
                case 3 -> atmService.withdraw();
                case 4 -> atmService.displayBalance();
                case 5 -> atmService.transferFunds();
                case 6 -> atmService.displayMiniStatement();
                case 7 -> {
                    System.out.println("Thank You");
                    atmService.logout();
                    scanner.close();
                    return;
                }
                case 8 -> atmService.demonstrateUncheckedExceptions();
                case 9 -> atmService.generateDailyErrorReport();
                case 10 -> atmService.generateTransactionSummary();
                default -> {
                    System.out.println("Invalid menu option. Please try again.");
                    LoggerUtil.logInfo("Invalid menu selection: " + choice);
                }
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=================================");
        System.out.println("ATM Banking System");
        System.out.println("=================================");
        System.out.println("1 Login");
        System.out.println("2 Deposit");
        System.out.println("3 Withdraw");
        System.out.println("4 Balance Inquiry");
        System.out.println("5 Transfer (Bonus)");
        System.out.println("6 Mini Statement");
        System.out.println("7 Exit");
        System.out.println("8 Unchecked Exception Demo");
        System.out.println("9 Daily Error Report (Bonus)");
        System.out.println("10 Transaction Summary (Bonus)");
        System.out.print("Choice : ");
    }
}
```

### `Lab7-ATMSystem/src/com/academy/atm/Transaction.java`

```java
package com.academy.atm;

import java.time.LocalDateTime;

public class Transaction {

    private final String accountNumber;
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final boolean successful;
    private final String details;

    public Transaction(String accountNumber, String type, double amount,
                       boolean successful, String details) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.successful = successful;
        this.details = details;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | $%.2f | %s | %s",
                timestamp, type, amount, successful ? "SUCCESS" : "FAILED", details);
    }
}
```

## Notes

# Lab 7 Reference Solution — ATM Banking System

Instructor reference only. Students should write these files themselves **after** completing Module 7 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab7-ATMSystem`
* macOS / Linux: `~/java-bootcamp/examples/Lab7-ATMSystem`

Do not confuse with flat exercise sources in `examples/module-07-exercises/`.

**Participant path reminder:** Run `java` from the **project root** so `transactions.txt` and `logs/` resolve. Do not log PINs.

## Pass criteria

| Path | Required |
| ---- | -------- |
| **Timed (~45 min)** | `login` + `deposit` + `withdraw`; smoke below including **mini statement**; evidence under `notes/screenshots/lab-7/` |
| **Full / extended** | Timed criteria plus transfer / daily error report / transaction summary bonuses |

## What the starter leaves for students

Already given (do **not** recreate on the timed path): four custom exception classes, `Account`, `Transaction`, `LoggerUtil`, `Main`, `displayBalance`, `displayMiniStatement`, unchecked-exception demo, Bonus stubs for transfer/reports.

**Core TODOs (still throw until filled):**

* `ATMService.login`
* `ATMService.deposit`
* `ATMService.withdraw`

**Bonus stubs (print message — do not crash):**

* `transferFunds` (menu 5)
* `generateDailyErrorReport` (menu 9)
* `generateTransactionSummary` (menu 10)

## Files

| File | Role |
| ---- | ---- |
| `AccountNotFoundException.java` | Missing account |
| `InvalidPinException.java` | Bad PIN (max 3 attempts) |
| `InvalidAmountException.java` | Zero / negative amount |
| `InsufficientFundsException.java` | Over-withdraw / transfer |
| `Account.java` | Account model + deposit/withdraw |
| `Transaction.java` | Transaction record |
| `LoggerUtil.java` | File logging under `logs/` |
| `ATMService.java` | Login + banking operations |
| `Main.java` | Menu-driven entry point |
| `transactions.txt` | Sample transaction fixture |

All Java sources under `src/com/academy/atm/`. Matches GUIDE **Expected files:** `*.java` + `transactions.txt` + `logs/`.

**Sample accounts:** `1001` / John Smith / PIN `1234` / balance `11000` · `1002` / Alice Johnson / PIN `5678` / balance `5000`

## How to compile and run

From this `Lab7-ATMSystem` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
New-Item -ItemType Directory -Force -Path logs | Out-Null
javac -d out `
  src\com\academy\atm\AccountNotFoundException.java `
  src\com\academy\atm\InvalidPinException.java `
  src\com\academy\atm\InvalidAmountException.java `
  src\com\academy\atm\InsufficientFundsException.java `
  src\com\academy\atm\Account.java `
  src\com\academy\atm\Transaction.java `
  src\com\academy\atm\LoggerUtil.java `
  src\com\academy\atm\ATMService.java `
  src\com\academy\atm\Main.java
java -cp out com.academy.atm.Main
```

**macOS / Linux:**

```bash
mkdir -p logs
javac -d out src/com/academy/atm/*.java
java -cp out com.academy.atm.Main
```

## Expected smoke transcript

Path: login `1001` / `1234` → withdraw `20000` (fail) → deposit `1000` → balance `12000` → mini statement → exit.

```text
Login Successful
...
Insufficient Balance
Transaction Cancelled
...
Deposit Successful
Current Balance : 12000
...
Session Transactions:
...
Historical Transactions (from file):
...
Thank You
```

Also confirm `logs/application.log` gained ERROR lines for the failed withdraw (no PIN values).

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating exception classes in timed path | Use starter types; fill only login/deposit/withdraw |
| Running `java` from wrong folder | `cd` to `Lab7-ATMSystem` so relative files resolve |
| Logging the PIN | Log account number / operation only |
| Catching too early inside Account | Propagate domain exceptions to the service/menu boundary |
| Menu 5 crashes timed explorers | Transfer is Bonus stub — implement after core |

## Clean

```powershell
Remove-Item -Recurse -Force out, logs   # PowerShell (keep transactions.txt)
# rm -rf out logs                       # bash
```


