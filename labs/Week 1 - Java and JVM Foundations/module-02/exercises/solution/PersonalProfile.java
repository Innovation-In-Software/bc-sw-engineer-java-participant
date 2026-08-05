import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        String age = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        System.out.println();
        System.out.printf("%-12s | %-20s%n", "Field", "Value");
        System.out.println("-------------|---------------");
        System.out.printf("%-12s | %-20s%n", "Name", name);
        System.out.printf("%-12s | %-20s%n", "Age", age);
        System.out.printf("%-12s | %-20s%n", "City", city);
        System.out.printf("%-12s | %-20s%n", "Hobby", hobby);

        scanner.close();
    }
}
