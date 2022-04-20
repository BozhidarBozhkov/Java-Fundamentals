import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            if (sumDigitsDivisibleBy8(i) && hasOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean sumDigitsDivisibleBy8(int n) {
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        if (sum % 8 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean hasOddDigit (int n){
        int counter = 0;
        while (n > 0){
            if ((n % 10) % 2 == 1){
                counter++;
            }
            n = n / 10;
        }
        if (counter > 1){
            return true;
        }
        else {
            return false;
        }
    }
}
