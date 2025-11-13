import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static String readStringToUpper(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().toUpperCase();
    }

    public static int readInt(String prompt) {
        while (true) { 
            try {
                System.out.println(prompt);
                int value = Integer.parseInt(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    public static int readIntRange(String prompt, int min, int max) {
        while (true) { 
            int value = readInt(prompt);
            if(value >= min && value <= max)    return value;
            System.out.println("Please enter a number between " + min + " and " + max);
        }
    }

    public static void clase() {scanner.close();}
}
