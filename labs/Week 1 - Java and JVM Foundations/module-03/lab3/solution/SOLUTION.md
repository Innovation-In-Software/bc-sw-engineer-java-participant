# Lab 3 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-3-GUIDE.md`](../LAB-3-GUIDE.md)

## Goal

**Banking system OOP**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab3 project, then:
cd Lab3-BankingSystem
# compile/run Main per LAB-3-GUIDE
```

## Complete Java sources (8 files)

### `Lab3-BankingSystem/src/com/academy/bank/Account.java`

```java
package com.academy.bank;

public abstract class Account {

    private String accountNumber;
    private double balance;
    private Customer customer;

    protected Account(String accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }

        double totalDeduction = amount + calculateCharges();
        if (totalDeduction > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }

        balance -= totalDeduction;
        return true;
    }

    public abstract void displayAccount();

    public double calculateCharges() {
        return 0.0;
    }

    public double calculateInterest() {
        return 0.0;
    }

    public String getAccountType() {
        return "Account";
    }
}
```

### `Lab3-BankingSystem/src/com/academy/bank/BankService.java`

```java
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
```

### `Lab3-BankingSystem/src/com/academy/bank/CurrentAccount.java`

```java
package com.academy.bank;

public class CurrentAccount extends Account implements Printable {

    private double transactionFee;

    public CurrentAccount(String accountNumber, double balance, Customer customer, double transactionFee) {
        super(accountNumber, balance, customer);
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateCharges() {
        return transactionFee;
    }

    @Override
    public void displayAccount() {
        System.out.println("Current Account");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Customer : " + getCustomer().getName());
        System.out.printf("Balance : %.0f%n", getBalance());
        System.out.printf("Transaction Fee : %.0f%n", transactionFee);
    }

    @Override
    public void printDetails() {
        displayAccount();
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
```

### `Lab3-BankingSystem/src/com/academy/bank/Customer.java`

```java
package com.academy.bank;

public class Customer implements Printable {

    private String customerId;
    private String name;
    private String email;
    private String phone;

    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
    }

    @Override
    public void printDetails() {
        display();
    }
}
```

### `Lab3-BankingSystem/src/com/academy/bank/Main.java`

```java
package com.academy.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("----------------------------------");

            switch (choice) {
                case 1 -> bankService.createCustomer();
                case 2 -> bankService.createSavingsAccount();
                case 3 -> bankService.createCurrentAccount();
                case 4 -> bankService.deposit();
                case 5 -> bankService.withdraw();
                case 6 -> bankService.displayAccounts();
                case 7 -> bankService.displayCustomers();
                case 8 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 9 -> bankService.transferMoney();
                case 10 -> bankService.displayTransactionHistory();
                case 11 -> bankService.displayAccountsSortedByBalance();
                case 12 -> bankService.displayHighestBalanceCustomer();
                case 13 -> bankService.generateAccountSummaryReport();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("================================");
        System.out.println("Bank Management System");
        System.out.println("================================");
        System.out.println("1 Create Customer");
        System.out.println("2 Create Savings Account");
        System.out.println("3 Create Current Account");
        System.out.println("4 Deposit");
        System.out.println("5 Withdraw");
        System.out.println("6 Display Accounts");
        System.out.println("7 Display Customers");
        System.out.println("8 Exit");
        System.out.println("9 Transfer Money (Bonus)");
        System.out.println("10 Transaction History (Bonus)");
        System.out.println("11 Sort Accounts by Balance (Bonus)");
        System.out.println("12 Highest Balance Customer (Bonus)");
        System.out.println("13 Account Summary Report (Bonus)");
        System.out.print("Choice : ");
    }
}
```

### `Lab3-BankingSystem/src/com/academy/bank/Printable.java`

```java
package com.academy.bank;

public interface Printable {

    void printDetails();
}
```

### `Lab3-BankingSystem/src/com/academy/bank/SavingsAccount.java`

```java
package com.academy.bank;

public class SavingsAccount extends Account implements Printable {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Customer customer, double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }

    @Override
    public void displayAccount() {
        System.out.println("Savings Account");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Customer : " + getCustomer().getName());
        System.out.printf("Balance : %.0f%n", getBalance());
        System.out.printf("Interest Rate : %.0f%%%n", interestRate);
        System.out.printf("Interest : %.0f%n", calculateInterest());
    }

    @Override
    public void printDetails() {
        displayAccount();
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
```

### `Lab3-BankingSystem/src/com/academy/bank/Transaction.java`

```java
package com.academy.bank;

public class Transaction {

    private String transactionId;
    private double amount;
    private String type;
    private String date;
    private String accountNumber;

    public Transaction(String transactionId, double amount, String type, String date, String accountNumber) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void display() {
        System.out.printf("ID : %s | Account : %s | Type : %s | Amount : %.2f | Date : %s%n",
                transactionId, accountNumber, type, amount, date);
    }
}
```

## Notes

# Lab 3 Reference Solution — Banking Management System

Instructor reference only. Students should write these files themselves **after** completing Module 3 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab3-BankingSystem`
* macOS / Linux: `~/java-bootcamp/examples/Lab3-BankingSystem`

Do not confuse with flat exercise sources in `examples/module-03-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Compile/run from `Lab3-BankingSystem` (project root).

## Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Eight types compile to `out/` with JDK 21 | |
| 2 | Create customer / savings / deposit / withdraw / display / exit work | |
| 3 | After deposit `2000` and withdraw `3000` on savings `10000` @ 5%, display shows balance `9000` and interest `450` | |
| 4 | Evidence under `notes/screenshots/lab-3/` | |

Timed path: fill TODOs only; bonus menus 9–13 optional.

## Expected smoke transcript

```text
Customer Created Successfully.
Savings Account Created.
...
Balance : 9000
Interest : 450
Thank You
```

Interactive path: create customer `C101` → savings account balance `10000` rate `5` → deposit `2000` → withdraw `3000` → display accounts → exit.

Starter menu also lists bonus options **9–13** — optional on the timed path.

## What starter leaves for students

| Area | Already done | Student fills |
| ---- | ------------ | ------------- |
| Package + eight type shells | `Main` menu 1–13, getters, `Printable` / `Transaction` / `Customer` shells | Confirm layout |
| `Account` | Abstract base shell | `deposit` / `withdraw` validation |
| `SavingsAccount` / `CurrentAccount` | Constructors / display hooks | `calculateInterest` / `calculateCharges` **before** Display Accounts |
| `BankService` | Method stubs | `createCustomer`, create accounts, `deposit`, `withdraw`, `displayAccounts` |

**Timed path:** skip GUIDE create Steps. Implement interest/charges before menu `6` (Display Accounts).

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating the eight classes on timed path | Copy starter; fill TODOs only |
| Displaying accounts before implementing interest/charges | Implement overrides first — display prints them |
| `new Account(...)` | Account is abstract — use Savings/Current |
| Wrong interest formula | `balance * rate / 100.0` (smoke: `9000 * 5 / 100 = 450`) |
| PowerShell `*.java` glob issues | Name each source in `javac` (see LAB-3-WINDOWS) |
| Wrong main | `java -cp out com.academy.bank.Main` |

## Files

| File | Role |
| ---- | ---- |
| `Printable.java` | Print contract |
| `Customer.java` | Customer profile |
| `Transaction.java` | Deposit / withdraw / transfer record |
| `Account.java` | Abstract account base |
| `SavingsAccount.java` | Interest calculation |
| `CurrentAccount.java` | Withdrawal charges |
| `BankService.java` | Orchestration + menu operations |
| `Main.java` | Menu-driven entry point |

All under `src/com/academy/bank/`. Matches GUIDE **Expected files:** eight types.

## How to compile and run

From this `Lab3-BankingSystem` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\bank\Printable.java `
  src\com\academy\bank\Customer.java `
  src\com\academy\bank\Transaction.java `
  src\com\academy\bank\Account.java `
  src\com\academy\bank\SavingsAccount.java `
  src\com\academy\bank\CurrentAccount.java `
  src\com\academy\bank\BankService.java `
  src\com\academy\bank\Main.java
java -cp out com.academy.bank.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/bank/*.java
java -cp out com.academy.bank.Main
```

Smoke path: customer `C101` → savings balance `10000` rate `5` → deposit `2000` → withdraw `3000` → display → exit.

**Expected snippet:** `Balance : 9000` · `Interest : 450` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```


