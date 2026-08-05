public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        account.deposit(50.00);
        account.withdraw(30.00);
        account.withdraw(500.00);

        System.out.printf(
                "Final balance: %.2f%n", account.getBalance());
    }
}
