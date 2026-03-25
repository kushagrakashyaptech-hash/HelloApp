public class HelloApp {
    public static void main(String[] args) {

        String message = "";

        if (args.length > 0) {
            // loop through all names
            for (int i = 0; i < args.length; i++) {
                message += args[i];

                // add comma between names
                if (i < args.length - 1) {
                    message += ", ";
                }
            }
        } else {
            message = "World";
        }

        System.out.println("Hello, " + message + "!");
    }
}