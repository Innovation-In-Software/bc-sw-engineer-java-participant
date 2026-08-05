import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Second number: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("Sum: %.2f%n", a + b);
        System.out.printf("Difference: %.2f%n", a - b);
        System.out.printf("Product: %.2f%n", a * b);
        System.out.printf("Quotient: %.2f%n", a / b);

        scanner.close();
    }
}
