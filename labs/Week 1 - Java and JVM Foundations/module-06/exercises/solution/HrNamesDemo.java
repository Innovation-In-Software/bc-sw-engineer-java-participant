import java.util.List;

public class HrNamesDemo {
    public static void main(String[] args) {
        List<String> hrNames = EmployeeData.sample().stream()
                .filter(employee -> employee.department().equals("HR"))
                .map(Employee::name)
                .sorted()
                .toList();

        System.out.println("HR names: " + hrNames);
    }
}
