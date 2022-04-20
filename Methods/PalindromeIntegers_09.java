import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
           if (isPalindrome(input)){
               System.out.println("true");
           } else {
               System.out.println("false");
           }
            input = scanner.nextLine();
        }

    }
    public static boolean isPalindrome(String number){
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            char symbol = number.charAt(i);
            reversed = reversed + symbol;
        }
        if (reversed.equals(number)){
            return true;
        }
        return false;
    }

}
