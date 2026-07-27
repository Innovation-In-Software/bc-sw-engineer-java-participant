import java.util.List;

public class HrNamesDemo {
    public static void main(String[] args) {
        List<String> hrNames = EmployeeData.sample().stream()
                // Keep only HR employees while elements are still Employee objects.
                .filter(employee -> employee.department().equalsIgnoreCase("HR"))
                // Transform Employee elements into String names.
                .map(Employee::name)
                // Sort the String elements alphabetically.
                .sorted()
                // Execute the pipeline and retain the result.
                .toList();

        System.out.println("HR names: " + hrNames);
    }
}