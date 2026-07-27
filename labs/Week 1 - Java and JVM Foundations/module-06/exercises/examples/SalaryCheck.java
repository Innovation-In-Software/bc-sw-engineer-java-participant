@FunctionalInterface
public interface SalaryCheck {
    // One abstract method makes this interface compatible with a lambda.
    boolean test(Employee employee);
}