import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        vowelsCount(input);

    }

    public static void vowelsCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.toLowerCase().charAt(i);
            if (symbol == 'a' || symbol == 'e'
                    || symbol == 'i' || symbol == 'o'
                    || symbol == 'u' || symbol == 'y'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
