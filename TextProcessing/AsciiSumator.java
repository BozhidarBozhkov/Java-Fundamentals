import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int start = Math.min(startSymbol, endSymbol);
        int end = Math.max(startSymbol, endSymbol);
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            int currentChar = text.charAt(i);
            if (currentChar > start && currentChar < end) {
                sum += currentChar;
            }
        }
        System.out.println(sum);

    }

}
