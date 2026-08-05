public class Methods {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);

        String message = greet("Aman");
        System.out.println(message);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
