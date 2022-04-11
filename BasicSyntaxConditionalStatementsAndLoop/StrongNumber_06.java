import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int number = num;
        int allDigitsFactorial = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = num % 10;
            num /= 10;
            int factorial = 1;
            for (int j = 1; j <= digit ; j++) {
                factorial *= j;
            }
            allDigitsFactorial += factorial;
        }
            if (allDigitsFactorial == number){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
    }

}
