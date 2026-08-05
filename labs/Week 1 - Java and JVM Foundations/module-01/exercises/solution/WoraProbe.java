public class WoraProbe {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        System.out.println("Bytecode runs on: " + osName);
    }
}
