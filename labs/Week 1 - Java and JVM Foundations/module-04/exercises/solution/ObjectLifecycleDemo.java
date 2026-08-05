public class ObjectLifecycleDemo {
    static class Person {
        final String name;

        Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person first = new Person("Aman"); // create + reference
        Person alias = first;              // second reference, same object

        System.out.println(
                "Same object: " + (first == alias));

        first = null; // object remains reachable through alias
        System.out.println(
                "Still reachable through alias: " + alias.name);

        alias = null; // no strong references remain
        System.out.println(
                "No strong references remain; object is GC-eligible.");

        System.gc();  // request only; JVM may ignore or delay it
        System.out.println("GC requested, not guaranteed.");
    }
}
