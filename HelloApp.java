public class HelloApp {
    public static void main(String[] args) {

        String name = "World"; // default value

        if (args.length > 0) {
            name = args[0]; // override if user gives input
        }

        System.out.println("Hello, " + name + "!");
    }
}