import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (isBetween6And10Chars(password) && consistsMin2Digits(password)
                && validationForLetterAndDigits(password)){
            System.out.println("Password is valid");
        }
        if (!isBetween6And10Chars(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validationForLetterAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!consistsMin2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean isBetween6And10Chars (String password){
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean validationForLetterAndDigits (String password){
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)){
                return false;
            }
        }
        return true;
    }
    public static boolean consistsMin2Digits(String password){
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57){
                counter++;
            }
            if (counter == 2){
                return true;
            }
        }
        return false;
    }

}
