import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furnitureName>[A-za-z]+)<<(?<price>[\\d.]+)!(?<qty>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);

        String line = scanner.nextLine();
        double spendMoney = 0;
        List<String> furniture = new LinkedList<>();

        while (!line.equals("Purchase")){
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("qty"));
                furniture.add(furnitureName);
                spendMoney += price * quantity;
            }

            line = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", spendMoney);
    }

}
