import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputMoney = scanner.nextLine();

        double totalMoney = 0;
        while (!inputMoney.equals("Start")) {
            double coinValue = Double.parseDouble(inputMoney);
            boolean isValid = (coinValue == 0.1 || coinValue == 0.2 || coinValue == 0.5 || coinValue == 1.00 || coinValue == 2.00);
            if (!isValid) {
                System.out.printf("Cannot accept %.2f%n", coinValue);
                coinValue = 0;
            }
            totalMoney += coinValue;

            inputMoney = scanner.nextLine();
        }
        String inputDrink = scanner.nextLine();
        double drinkPrice = 0;
        while (!inputDrink.equals("End")){
            String drink = inputDrink;
            switch (drink){
                case "Nuts":
                    drinkPrice = 2.00;
                    break;
                case "Water":
                    drinkPrice = 0.70;
                    break;
                case "Crisps":
                    drinkPrice = 1.50;
                    break;
                case "Soda":
                    drinkPrice = 0.80;
                    break;
                case "Coke":
                    drinkPrice = 1.00;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            boolean validProduct = (drink.equals("Coke")) || (drink.equals("Nuts")) || (drink.equals("Water")) || (drink.equals("Soda")) || (drink.equals("Crisps"));
            if (drinkPrice > totalMoney){
                System.out.println("Sorry, not enough money");
                drinkPrice = 0;
            } else if (validProduct)  {
                System.out.printf("Purchased %s%n", drink);
            }
                totalMoney -= drinkPrice;

            inputDrink = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }

}
