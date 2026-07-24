package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService(sc);
        System.out.println("===================================");
        System.out.println("Bank Management System");
        System.out.println("===================================");
        System.out.println("1 Create Customer");
        System.out.println("2 Create Savings Account");
        System.out.println("3 Create Current Account");
        System.out.println("4 Deposit");
        System.out.println("5 Withdraw");
        System.out.println("6 Display Accounts");
        System.out.println("7 Display Customers");
        System.out.println("8 Exit");
        while (true) {
            System.out.print("Choice : ");

            String input = sc.nextLine().trim();
            int choice = -1;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Pick a number 1-8 and try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    bank.createCustomer();
                    break;
                case 2:
                    bank.createSavings();
                    break;
                case 3:
                    bank.createCurrent();
                    break;
                case 4:
                    bank.deposit();
                    break;
                case 5:
                    bank.withdraw();
                    break;
                case 6:
                    bank.displayAccounts();
                    break;
                case 7:
                    bank.displayCustomers();
                    break;
                case 8:
                    System.out.println("Thank you.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Pick a number 1-8 and try again.");
            }
            System.out.println("-------------------------------------------");
        }
    }

}