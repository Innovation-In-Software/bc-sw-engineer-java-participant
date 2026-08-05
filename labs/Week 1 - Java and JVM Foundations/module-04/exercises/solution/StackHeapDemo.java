public class StackHeapDemo {
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static void printPerson(Person person) {
        // Local primitive in the printPerson stack frame
        int nameLength = person.name.length();
        System.out.printf("%s has %d letters.%n",
                person.name, nameLength);
    }

    public static void main(String[] args) {
        // Primitive value belongs to main's frame
        int count = 1;

        // Reference is local; new Person object is on the heap
        Person person = new Person("Aman");

        printPerson(person);
        System.out.println("Count: " + count);
    }
}
