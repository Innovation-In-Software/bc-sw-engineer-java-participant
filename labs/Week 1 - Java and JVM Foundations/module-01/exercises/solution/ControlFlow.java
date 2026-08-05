public class ControlFlow {
    public static void main(String[] args) {
        int number = 4;

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println("countdown " + count);
            count--;
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
