import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numberOfLines; i++) {
            String letter = scanner.nextLine();
            char symbol = letter.charAt(0);
            sum += symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
