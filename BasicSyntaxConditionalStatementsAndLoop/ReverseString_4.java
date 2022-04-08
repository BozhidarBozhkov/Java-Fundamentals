import java.util.Scanner;

public class ReverseString_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedInput = "";

        for (int i = input.length() - 1 ; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        System.out.println(reversedInput);
    }

}
