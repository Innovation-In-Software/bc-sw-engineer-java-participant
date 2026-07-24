import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> categories = new HashSet<>();

        System.out.println(
                "Added Java first time: "
                        + categories.add("Java"));

        categories.add("Testing");
        categories.add("Databases");

        System.out.println(
                "Added Java second time: "
                        + categories.add("Java"));

        System.out.println(
                "Unique count: " + categories.size());
        System.out.println(
                "Contains Testing: "
                        + categories.contains("Testing"));

        // HashSet order is unspecified; TreeSet sorts.
        System.out.println(
                "Sorted view: "
                        + new TreeSet<>(categories));
    }
}