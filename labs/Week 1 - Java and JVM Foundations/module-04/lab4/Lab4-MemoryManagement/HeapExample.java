public class HeapExample {

    static class Student {
        private final String name;

        Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "'}";
        }
    }

    static class Employee {
        private final String name;
        private final String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', department='" + department + "'}";
        }
    }

    static class Customer {
        private final String name;

        Customer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer{name='" + name +"'}";
        }
    }

    static class Book {
        private final String title;

        Book(String title) {
            this.title = title;
        }

        public String toString() {
            return "Book{title='" + title + "'}";
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Heap Memory Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");
        System.out.println();

        Student student = new Student("John");
        Employee employee = new Employee("Priya", "Engineering");
        Customer customer = new Customer("Wei");
        Book book = new Book("Effective Java");

        System.out.println("Objects created on the heap:");
        printObjectInfo("student", student);
        printObjectInfo("employee", employee);
        printObjectInfo("customer", customer);
        printObjectInfo("book", book);
        MemoryMonitor.printMemoryReport("After Allocation");
        System.out.println();

        System.out.println("Observation:");
        System.out.println("- References (student, employee, customer, book) live on the stack");
        System.out.println("- Actual objects live on the heap");
    }

    private static void printObjectInfo(String name, Object obj) {
        System.out.println("Reference (stack) : " + name);
        System.out.println("Object (heap)     : " + obj);
        System.out.println("Identity hash     : " + System.identityHashCode(obj));
        System.out.println();
    }
}