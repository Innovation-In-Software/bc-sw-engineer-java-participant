import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r * r;

        System.out.printf("Area: %.2f%n", area);

        scanner.close();
    }
}
