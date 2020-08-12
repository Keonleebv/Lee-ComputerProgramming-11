import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;

            Scanner scan = new Scanner(System.in);
            text = scan.next();

            System.out.println(text + " becomes -> " + text.substring(text.length() - 1) + text.substring(0, text.length() - 1)
                    + "B4eD" + " which translates back to " + text);

    }
}

