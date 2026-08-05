import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> copies = new HashMap<>();

        copies.put("ISBN-JAVA", 3);
        copies.put("ISBN-CLEAN", 2);
        copies.put("ISBN-TEST", 4);

        System.out.println(
                "Java copies: " + copies.get("ISBN-JAVA"));

        copies.put("ISBN-JAVA", 5);
        copies.remove("ISBN-CLEAN");

        System.out.println(
                "Updated Java copies: "
                + copies.get("ISBN-JAVA"));
        System.out.println(
                "Missing ISBN: "
                + copies.getOrDefault("ISBN-MISSING", 0));

        for (Map.Entry<String, Integer> entry
                : copies.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(
                "Sorted snapshot: " + new TreeMap<>(copies));
    }
}
