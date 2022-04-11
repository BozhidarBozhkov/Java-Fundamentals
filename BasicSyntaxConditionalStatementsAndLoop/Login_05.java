import java.sql.SQLOutput;
import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        String input = scanner.nextLine();
        int countLogin = 0;
        for (int i = username.length() - 1; i >= 0 ; i--) {
            password += username.charAt(i);
        }
        while (!password.equals(input)){
            countLogin++;
            if (countLogin > 3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (password.equals(input)){
            System.out.printf("User %s logged in.", username);
        }
    }

}
