package ask;

import java.util.Scanner;

public class Ask {
    private static Scanner s = new Scanner(System.in);

    public static String forString() {
        return s.nextLine();
    }

    public static int forInt() {
        String str = forString();
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException e) {
            System.out.println("I expected an integer, but you gave '" + str + "'. Enter an integer:");
            return forInt();
        }
    }

    public static double forDouble() {
        String str = forString();
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("I expected an double, but you gave '" + str + "'. Enter an double:");
            return forDouble();
        }
    }

    public static boolean forBoolean() {
        String str = forString();
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        System.out.println("I expected an boolean, but you gave '" + str + "'. Enter an boolean:");
        return forBoolean();
    }
}
