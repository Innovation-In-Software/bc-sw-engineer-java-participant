public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {
        Person person = new Person("Aman", 21);
        person.display();
    }
}
