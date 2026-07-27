// A record is an immutable data carrier. Java generates the constructor
// and accessor methods: id(), name(), department(), and salary().
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}