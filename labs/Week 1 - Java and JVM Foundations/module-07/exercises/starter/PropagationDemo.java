public class PropagationDemo {
    static void level3() {
        // TODO: throw a RuntimeException with a clear message
        _____
    }

    static void level2() {
        level3();
    }

    static void level1() {
        level2();
    }

    public static void main(String[] args) {
        try {
            level1();
        } catch (_____ ex) {
            System.out.println("Boundary caught: " + ex.getMessage());
        }
        System.out.println("Session continued.");
    }
}
