public class MethodsDemo {
    public static int square(int n) {
        return n * n;
    }

    public static double square(double n) {
        return n * n;
    }

    public static void main(String[] args) {
        int intResult = square(4);
        double doubleResult = square(2.5);

        System.out.println("square(4) = " + intResult);
        System.out.println("square(2.5) = " + doubleResult);
    }
}
