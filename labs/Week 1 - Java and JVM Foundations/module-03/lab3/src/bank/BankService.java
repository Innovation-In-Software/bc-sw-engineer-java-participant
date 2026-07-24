package bank;

import java.sql.SQLOutput;
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
        String id = "";
        String name = "";
        String email = "";
        String phone = "";
        while (true) {
            System.out.print("Customer ID: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid Customer ID. Try Again.");
                continue;
            }
            id = input;
            if (findCustomer(id)) {
                System.out.println("Customer with that ID already exists. Try a different number.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Name: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid name. Try again.");
                continue;
            }
            name = input;
            break;
        }

        while (true) {
            System.out.print("Email: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid email. Try again.");
                continue;
            }
            email = input;
            break;
        }

        while (true) {
            System.out.print("Phone: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid phone number. Try again.");
                continue;
            }
            phone = input;
            break;
        }

        Customer customer = new Customer(id, name, email, phone);
        customers[customerCount++] = customer;
        System.out.println("Customer Created Successfully.");
    }

    public void createSavings() {
        Customer customer = null;
        while (true) {
            System.out.print("Customer ID: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid Customer ID. Try again.");
                continue;
            }
            String id = input;
            customer = readExistingCustomer(id);
            if (customer == null) {
                System.out.println("Customer could not be found. Try again.");
                continue;
            }
            break;
        }
        double balance = -1;
        double interestRate= -1;
        while (true) {
            System.out.print("Initial Balance: ");
            String input = scanner.nextLine().trim();
            balance = readPositiveDouble(input);
            if (balance < 0) {
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Interest Rate (%): ");
            String input = scanner.nextLine().trim();
            interestRate = readPositiveDouble(input);
            if (interestRate < 0 || interestRate > 100) {
                System.out.println("Interest rate must be between 0-100. Try again.");
                continue;
            }
            break;
        }

        String accountNumber = String.valueOf(nextAccountNumber++);
        SavingsAccount savings = new SavingsAccount(accountNumber, balance, customer, interestRate);
        accounts[accountCount++] = savings;

        System.out.println("...\nSavings Account Created.");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void createCurrent() {
        Customer customer = null;
        while (true) {
            System.out.print("Customer ID: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid Customer ID. Try again.");
                continue;
            }
            String id = input;
            customer = readExistingCustomer(id);
            if (customer == null) {
                System.out.println("Customer could not be found. Try again.");
                continue;
            }
            break;
        }
        double balance = -1;
        double fee= -1;
        while (true) {
            System.out.print("Initial Balance: ");
            String input = scanner.nextLine().trim();
            balance = readPositiveDouble(input);
            if (balance < 0) {
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Transaction Fee: ");
            String input = scanner.nextLine().trim();
            fee = readPositiveDouble(input);
            if (fee <= 0) {
                continue;
            }
            break;
        }

        String accountNumber = String.valueOf(nextAccountNumber++);
        CurrentAccount current = new CurrentAccount(accountNumber, balance, customer, fee);
        accounts[accountCount++] = current;

        System.out.println("...\nAccount Created.");
        current.displayAccount();
    }

    public void deposit() {
        Account account = null;
        while (true) {
            System.out.print("Account Number: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid account number. Try again.");
                continue;
            }

            account = findAccount(input);
            if (account == null) {
                System.out.println("Account could not be found. Try again.");
                continue;
            }
            break;
        }

        double amount = -1;
        while (true) {
            System.out.print("Deposit Amount: ");
            String input = scanner.nextLine().trim();
            amount = readPositiveDouble(input);
            if (amount <= 0) {
                System.out.println("Deposit rejected: Amount must be positive. Try again.");
                continue;
            }
            break;
        }
        account.deposit(amount);
        System.out.println("Balance Updated : " + account.getBalance());
    }

    public void withdraw() {
        Account account = null;
        while (true) {
            System.out.print("Account Number: ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid account number. Try again.");
                continue;
            }
            account = findAccount(input);
            if (account == null) {
                System.out.println("Account could not be found. Try again.");
                continue;
            }
            break;
        }

        double amount = -1;
        while (true) {
            System.out.print("Withdraw: ");
            String input = scanner.nextLine().trim();
            amount = readPositiveDouble(input);
            if (amount <= 0 || amount + account.calculateCharges() > account.getBalance()) {
                System.out.println("Withdraw rejected: Amount must be positive and less than balance. Try again.");
                continue;
            }
            break;
        }
        account.withdraw(amount);
        if (account.getAccountType().equals("Current")) {
            System.out.println("Transaction Fee : " + account.calculateCharges());
        }

        System.out.println("Balance Updated : " + account.getBalance());
    }

    public void displayAccounts() {
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccount();
        }
    }

    public void displayCustomers() {
        System.out.println();
        for (int i = 0; i < customerCount; i++) {
            customers[i].printDetails();
        }
    }

    // Returns true if customer with id is found,
    // false otherwise
    private boolean findCustomer(String id) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private int readPositiveInt(String input) {
        int id = -1;
        if (input.isEmpty()) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        if (id < 0) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        return id;
    }

    private double readPositiveDouble(String input) {
        double id = -1;
        if (input.isEmpty()) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        try {
            id = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        if (id < 0) {
            System.out.println("Invalid input. Try again.");
            return -1;
        }
        return id;
    }

    private Customer readExistingCustomer(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    private Account findAccount(String number) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(number)) {
                return accounts[i];
            }
        }
        return null;
    }

}