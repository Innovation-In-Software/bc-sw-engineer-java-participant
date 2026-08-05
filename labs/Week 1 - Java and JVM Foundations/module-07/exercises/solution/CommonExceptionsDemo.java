public class CommonExceptionsDemo {
    public static void main(String[] args) {
        try {
            int divisor = 0;
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            int[] values = {10, 20};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        System.out.println("Program continued.");
    }
}
