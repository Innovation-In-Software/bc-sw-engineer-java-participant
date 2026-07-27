import java.util.Comparator;
import java.util.List;

public class SalaryExtremesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // One comparator defines ascending salary order.
        Comparator<Employee> bySalary =
                Comparator.comparingDouble(Employee::salary);

        // max/min are terminal reductions and may have no result for empty input.
        Employee highest = employees.stream()
                .max(bySalary)
                .orElseThrow();

        Employee lowest = employees.stream()
                .min(bySalary)
                .orElseThrow();

        System.out.printf("Highest: %s - %.0f%n",
                highest.name(), highest.salary());
        System.out.printf("Lowest: %s - %.0f%n",
                lowest.name(), lowest.salary());

        List<Employee> empty = List.of();
        System.out.println(empty.stream().max(bySalary));
    }
}