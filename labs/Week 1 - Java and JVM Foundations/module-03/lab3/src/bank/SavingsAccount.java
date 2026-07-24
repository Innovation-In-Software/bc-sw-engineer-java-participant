package bank;

public class SavingsAccount extends Account implements Printable {
    // Hidden state: outside code cannot write account.balance directly
    private double balance;
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Customer customer, double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }

    @Override
    void displayAccount() {
        System.out.println(getAccountType() + " Account");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Customer : " + getCustomer().getName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }

    @Override
    public void printDetails() {
        displayAccount();
    }
}