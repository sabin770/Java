public class commandLine {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Command-line arguments:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }}