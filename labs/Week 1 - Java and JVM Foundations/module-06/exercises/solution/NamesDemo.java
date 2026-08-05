import java.util.List;

public class NamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        List<String> names = employees.stream()
                .map(Employee::name)
                .toList();

        System.out.println("Employee names:");
        names.forEach(System.out::println);
    }
}
