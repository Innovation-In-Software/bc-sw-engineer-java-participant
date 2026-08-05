public class Customer implements Printable {
    private final String id;
    private final String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.printf(
                "Customer %s: %s%n", id, name);
    }
}
