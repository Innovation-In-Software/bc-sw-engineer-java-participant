import java.util.List;

public class FilterSalaryDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // stream() reads the collection as a pipeline source.
        // filter keeps only employees for which the predicate returns true.
        // toList is the terminal operation that executes the pipeline.
        List<Employee> highEarners = employees.stream()
                .filter(employee -> employee.salary() > 60_000)
                .toList();

        System.out.println("Employees above 60000:");
        highEarners.forEach(employee ->
                System.out.printf("%s - %.0f%n",
                        employee.name(), employee.salary()));

        // The original source still contains all five employees.
        System.out.println("Source size: " + employees.size());
        System.out.println("Filtered size: " + highEarners.size());
    }
}