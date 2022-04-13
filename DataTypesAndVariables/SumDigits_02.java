import java.sql.SQLOutput;
import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String input = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int digit = c - '0';
            sum += digit;
        }
        System.out.println(sum);
    }
}

