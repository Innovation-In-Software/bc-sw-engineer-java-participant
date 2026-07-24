import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Program to List interface; construct ArrayList.
        List<String> books = new ArrayList<>();

        books.add("Java Fundamentals"); // index 0
        books.add("Clean Code");        // index 1
        books.add("Effective Java");    // index 2
        books.add("Java Fundamentals"); // duplicate is allowed

        // Replace the value at index 1.
        books.set(1, "Clean Architecture");

        boolean found =
                books.contains("Effective Java");

        // Removes the first matching value only.
        books.remove("Java Fundamentals");

        System.out.println(
                "Found Effective Java: " + found);
        System.out.println("Size: " + books.size());

        for (int i = 0; i < books.size(); i++) {
            System.out.printf(
                    "%d: %s%n", i, books.get(i));
        }
    }
}