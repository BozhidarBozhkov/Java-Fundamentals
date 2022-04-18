import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleChars(text);
    }

    public static void printMiddleChars(String text) {
        char firstMiddle = text.charAt(text.length() / 2);
        if (text.length() % 2 == 0) {
            char secondMiddle = (char)0;
            for (int i = 0; i < text.length() / 2; i++) {
                firstMiddle = text.charAt(text.length() / 2 - 1);
            }
            for (int i = text.length() / 2; i > 0; i--) {
                secondMiddle = text.charAt(text.length() / 2);
            }
            System.out.printf("%c%c", firstMiddle, secondMiddle);
        } else {
            System.out.print(firstMiddle);
        }
    }
}
