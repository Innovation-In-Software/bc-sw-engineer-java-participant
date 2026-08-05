public class LambdaDemo {
    public static void main(String[] args) {
        Employee alice = EmployeeData.sample().get(0);

        SalaryCheck anonymous = new SalaryCheck() {
            @Override
            public boolean test(Employee employee) {
                return employee.salary() > 60_000;
            }
        };

        SalaryCheck lambda = employee -> employee.salary() > 60_000;

        System.out.println("Employee: " + alice.name());
        System.out.println("Anonymous result: " + anonymous.test(alice));
        System.out.println("Lambda result: " + lambda.test(alice));
    }
}
