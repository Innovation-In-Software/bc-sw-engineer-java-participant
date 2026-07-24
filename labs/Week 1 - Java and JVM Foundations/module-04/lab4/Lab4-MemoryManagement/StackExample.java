public class StackExample {

    public static void main(String[] args) {
        System.out.println("===== Stack Memory Demonstration =====");
        System.out.println("Call chain: main() -> methodA() -> methodB() -> methodC()\n");

        int mainCounter = 1;
        String mainLabel = "main-frame";
        Person mainPerson = new Person("Aman", 30);

        System.out.println("main() frame");
        System.out.println("  Primitive on stack : mainCounter = " + mainCounter);
        System.out.println("  Primitive on stack : mainLabel = " + mainLabel);
        System.out.println("  Reference on stack : mainPerson -> " + mainPerson.toString()
                + " (identity hash: " + System.identityHashCode(mainPerson) + ")\n");

        methodA(mainPerson, mainCounter);

        System.out.println("\nBack in main() - methodA()/methodB()/methodC() frames have been removed from the stack.");
    }

    static void methodA(Person personA, int inheritedCounter) {
        int localA = inheritedCounter + 1;

        System.out.println("methodA() frame");
        System.out.println("  Parameter (reference) : personA -> " + personA + " (identity hash: " + System.identityHashCode(personA) + ")");
        System.out.println("  Primitive on stack     : localA = " +localA);
        System.out.println();

        methodB(personA, localA);

        System.out.println("Back in methodA() - methodB()/methodC() frames have been removed from the stack.");
    }

    static void methodB(Person personB, int localA) {
        int localB = localA * 2;

        System.out.println("methodB() frame");
        System.out.println("   Parameter (reference) : personB -> " + personB + " (identity hash: " + System.identityHashCode(personB) + ")");
        System.out.println("   Primitive on stack     : localB = " + localB);
        System.out.println();

        methodC(personB, localB);

        System.out.println("Back in methodB() - methodC() frame has been removed from the stack.");
    }

    static void methodC(Person personC, int localB) {
        int localC = localB + personC.getAge();

        System.out.println("methodC() frame");
        System.out.println("   Parameter (reference) : personC -> " + personC
                + " (identity hash: " +System.identityHashCode(personC) + ")");
        System.out.println("   Primitive on stack     : localC = " + localC);
        System.out.println("\nmethodC() is about to return; its frame will be popped from the stack.");
    }
}