package com.academy.bank;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BankService {

    private static final int MAX_CUSTOMERS = 50;
    private static final int MAX_ACCOUNTS = 100;
    private static final int MAX_TRANSACTIONS = 500;

    private final Customer[] customers = new Customer[MAX_CUSTOMERS];
    private final Account[] accounts = new Account[MAX_ACCOUNTS];
    private final Transaction[] transactions = new Transaction[MAX_TRANSACTIONS];

    private int customerCount = 0;
    private int accountCount = 0;
    private int transactionCount = 0;
    private int nextAccountNumber = 10001;
    private int nextTransactionNumber = 1;

    private final Scanner scanner;

    public BankService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void createCustomer() {
        if (customerCount >= MAX_CUSTOMERS) {
            System.out.println("Customer limit reached.");
            return;
        }

        System.out.print("Customer ID : ");
        String customerId = scanner.nextLine().trim();

        if (findCustomer(customerId) != null) {
            System.out.println("Customer ID already exists.");
            return;
        }

        System.out.print("Name : ");
        String name = scanner.nextLine().trim();
        System.out.print("Email : ");
        String email = scanner.nextLine().trim();
        System.out.print("Phone : ");
        String phone = scanner.nextLine().trim();

        customers[customerCount++] = new Customer(customerId, name, email, phone);
        System.out.println("Customer Created Successfully.");
    }

    public void createSavingsAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Account limit reached.");
            return;
        }

        Customer customer = readExistingCustomer();
        if (customer == null) {
            return;
        }

        double balance = readPositiveAmount("Initial Balance : ");
        double interestRate = readPositiveAmount("Interest Rate (%) : ");

        String accountNumber = String.valueOf(nextAccountNumber++);
        Account account = new SavingsAccount(accountNumber, balance, customer, interestRate);
        accounts[accountCount++] = account;

        System.out.println("Savings Account Created.");
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.0f%n", balance);
        System.out.printf("Interest Rate : %.0f%%%n", interestRate);
    }

    public void createCurrentAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Account limit reached.");
            return;
        }

        Customer customer = readExistingCustomer();
        if (customer == null) {
            return;
        }

        double balance = readPositiveAmount("Initial Balance : ");
        double transactionFee = readPositiveAmount("Transaction Fee : ");

        String accountNumber = String.valueOf(nextAccountNumber++);
        Account account = new CurrentAccount(accountNumber, balance, customer, transactionFee);
        accounts[accountCount++] = account;

        System.out.println("Current Account Created.");
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.0f%n", balance);
        System.out.printf("Transaction Fee : %.0f%n", transactionFee);
    }

    public void deposit() {
        Account account = readExistingAccount();
        if (account == null) {
            return;
        }

        double amount = readPositiveAmount("Deposit Amount : ");
        account.deposit(amount);
        recordTransaction(account.getAccountNumber(), amount, "DEPOSIT");

        System.out.printf("Balance Updated : %.0f%n", account.getBalance());
    }

    public void withdraw() {
        Account account = readExistingAccount();
        if (account == null) {
            return;
        }

        double amount = readPositiveAmount("Withdraw : ");
        boolean success = account.withdraw(amount);

        if (!success) {
            return;
        }

        recordTransaction(account.getAccountNumber(), amount, "WITHDRAW");

        if (account instanceof CurrentAccount currentAccount) {
            System.out.printf("Fee : %.0f%n", currentAccount.getTransactionFee());
            System.out.printf("Total Deducted : %.0f%n", amount + currentAccount.getTransactionFee());
        }

        System.out.printf("Balance Updated : %.0f%n", account.getBalance());
    }

    public void displayAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccount();
            System.out.println("----------------------------------");
        }
    }

    public void displayCustomers() {
        if (customerCount == 0) {
            System.out.println("No customers available.");
            return;
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < customerCount; i++) {
            customers[i].display();
            System.out.println("----------------------------------");
        }
    }

    public void transferMoney() {
        System.out.println("From Account");
        Account fromAccount = readExistingAccount();
        if (fromAccount == null) {
            return;
        }

        System.out.println("To Account");
        Account toAccount = readExistingAccount();
        if (toAccount == null) {
            return;
        }

        if (fromAccount.getAccountNumber().equals(toAccount.getAccountNumber())) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }

        double amount = readPositiveAmount("Transfer Amount : ");
        double totalDeduction = amount;

        if (fromAccount instanceof CurrentAccount currentAccount) {
            totalDeduction += currentAccount.getTransactionFee();
        }

        if (totalDeduction > fromAccount.getBalance()) {
            System.out.println("Insufficient balance for transfer.");
            return;
        }

        boolean withdrawn = fromAccount.withdraw(amount);
        if (!withdrawn) {
            return;
        }

        toAccount.deposit(amount);
        recordTransaction(fromAccount.getAccountNumber(), amount, "TRANSFER_OUT");
        recordTransaction(toAccount.getAccountNumber(), amount, "TRANSFER_IN");

        System.out.println("Transfer completed successfully.");
        System.out.printf("From Balance : %.0f%n", fromAccount.getBalance());
        System.out.printf("To Balance : %.0f%n", toAccount.getBalance());
    }

    public void displayTransactionHistory() {
        System.out.print("Account Number : ");
        String accountNumber = scanner.nextLine().trim();
        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        boolean found = false;
        System.out.println("Transaction History");
        System.out.println("----------------------------------");

        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i].getAccountNumber().equals(accountNumber)) {
                transactions[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No transactions found.");
        }

        System.out.println("----------------------------------");
    }

    public void displayAccountsSortedByBalance() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return;
        }

        Account[] sortedAccounts = Arrays.copyOf(accounts, accountCount);
        Arrays.sort(sortedAccounts, Comparator.comparingDouble(Account::getBalance).reversed());

        System.out.println("Accounts Sorted by Balance");
        System.out.println("----------------------------------");
        for (Account account : sortedAccounts) {
            System.out.printf("%s | %s | Balance : %.2f%n",
                    account.getAccountType(),
                    account.getAccountNumber(),
                    account.getBalance());
        }
        System.out.println("----------------------------------");
    }

    public void displayHighestBalanceCustomer() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return;
        }

        Customer topCustomer = null;
        double highestTotal = -1;

        for (int i = 0; i < customerCount; i++) {
            Customer customer = customers[i];
            double totalBalance = 0;

            for (int j = 0; j < accountCount; j++) {
                if (accounts[j].getCustomer().getCustomerId().equals(customer.getCustomerId())) {
                    totalBalance += accounts[j].getBalance();
                }
            }

            if (totalBalance > highestTotal) {
                highestTotal = totalBalance;
                topCustomer = customer;
            }
        }

        if (topCustomer == null) {
            System.out.println("No customer balances found.");
            return;
        }

        System.out.println("Highest Balance Customer");
        topCustomer.display();
        System.out.printf("Total Balance : %.2f%n", highestTotal);
    }

    public void generateAccountSummaryReport() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return;
        }

        double totalBalance = 0;
        int savingsCount = 0;
        int currentCount = 0;

        System.out.println("Account Summary Report");
        System.out.println("==================================");

        for (int i = 0; i < accountCount; i++) {
            Account account = accounts[i];
            account.displayAccount();
            totalBalance += account.getBalance();

            if (account instanceof SavingsAccount) {
                savingsCount++;
            } else if (account instanceof CurrentAccount) {
                currentCount++;
            }

            System.out.println("----------------------------------");
        }

        System.out.printf("Total Accounts : %d%n", accountCount);
        System.out.printf("Savings Accounts : %d%n", savingsCount);
        System.out.printf("Current Accounts : %d%n", currentCount);
        System.out.printf("Combined Balance : %.2f%n", totalBalance);
        System.out.println("==================================");
    }

    private Customer readExistingCustomer() {
        if (customerCount == 0) {
            System.out.println("Create a customer first.");
            return null;
        }

        System.out.print("Customer ID : ");
        String customerId = scanner.nextLine().trim();
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
        }

        return customer;
    }

    private Account readExistingAccount() {
        if (accountCount == 0) {
            System.out.println("No accounts available.");
            return null;
        }

        System.out.print("Account Number : ");
        String accountNumber = scanner.nextLine().trim();
        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
        }

        return account;
    }

    private Customer findCustomer(String customerId) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerId().equalsIgnoreCase(customerId)) {
                return customers[i];
            }
        }
        return null;
    }

    private Account findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    private void recordTransaction(String accountNumber, double amount, String type) {
        if (transactionCount >= MAX_TRANSACTIONS) {
            return;
        }

        String transactionId = "T" + nextTransactionNumber++;
        String date = LocalDate.now().toString();
        transactions[transactionCount++] = new Transaction(transactionId, amount, type, date, accountNumber);
    }

    private double readPositiveAmount(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Amount must not be negative.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid amount. Please try again.");
            }
        }
    }
}
