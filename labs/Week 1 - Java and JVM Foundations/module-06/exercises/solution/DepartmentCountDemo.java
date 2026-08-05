import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DepartmentCountDemo {
    public static void main(String[] args) {
        Map<String, Long> counts = EmployeeData.sample().stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()));

        Map<String, Long> sortedCounts = new TreeMap<>(counts);

        sortedCounts.forEach((department, count) ->
                System.out.println(department + ": " + count));
    }
}
