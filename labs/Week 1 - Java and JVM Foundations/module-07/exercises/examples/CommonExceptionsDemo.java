public class CommonExceptionsDemo {
    public static void main(String[] args) {
        // Isolate each failure so one catch cannot skip later demos.
        try {
            int divisor = 0; // variable form avoids some constant-expression warnings
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            String value = null;
            // Dereferencing null throws NullPointerException.
            System.out.println(value.length());
        } catch (NullPointerException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            int[] values = {10, 20};
            // Valid indexes are only 0 and 1.
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        // Reaching this line proves recovery kept the process alive.
        System.out.println("Program continued.");
    }
}