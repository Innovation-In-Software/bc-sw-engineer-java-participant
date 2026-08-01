import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Score (0-100): ");
        int score = Integer.parseInt(scanner.nextLine());
        // TODO: if / else if / else → print Grade: A/B/C/D/F
        System.out.print("Day number (1-7): ");
        int day = Integer.parseInt(scanner.nextLine());
        // TODO: switch → print weekday name (remember break)
        throw new UnsupportedOperationException("TODO");
    }
}
