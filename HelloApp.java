public class HelloApp {

    public static void main(String[] args) {

        // Default message if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use String.join() to concatenate names
        String names = String.join(", ", args);

        System.out.println("Hello, " + names + "!");
    }
}