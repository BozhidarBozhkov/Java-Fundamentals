import java.util.Scanner;

public class Messages_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int mainDigit = 0;
        String output = "";

        for (int i = 0; i < lenght; i++) {
            String input = scanner.nextLine();
            int numberOfDigits = input.length();

            int number = Integer.parseInt(input);
            while (number >= 10) {
                number /= 10;
            }
            mainDigit = number;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }

            int letterIndex = offset + numberOfDigits - 1;
            int letterCode = letterIndex + 97;


            char letter = (char) letterCode;
            if (mainDigit == 0){
                letter = (char) (mainDigit + 32);
            }
            output += letter;
        }
        System.out.println(output);
    }
}
