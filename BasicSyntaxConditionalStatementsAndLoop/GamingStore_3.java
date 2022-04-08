import java.sql.SQLOutput;
import java.util.Scanner;

public class GamingStore_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSpent = 0;
        double gamePrice = 0;

        while (!input.equals("Game Time")) {
            String gameName = input;
            switch (gameName) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            boolean isValid = gameName.equals("RoverWatch") || gameName.equals("Honored 2") ||
                    gameName.equals("Zplinter Zell") || gameName.equals("CS: OG") ||
                    gameName.equals("RoverWatch Origins Edition") || gameName.equals("OutFall 4");
            if (gamePrice > availableMoney) {
                System.out.println("Too Expensive");

            } else {
                availableMoney -= gamePrice;
                totalSpent += gamePrice;
                if (isValid) {
                    System.out.printf("Bought %s%n", gameName);
                }
            }
            if (availableMoney <= 0) {
                System.out.println("Out of money!");
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, availableMoney);
        }
    }

}
