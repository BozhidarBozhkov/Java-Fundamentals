import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[\\d.?\\d]+)\\$";
        Pattern pattern = Pattern.compile(regex);

        String line = scanner.nextLine();
        double income = 0;
        while (!line.equals("end of shift")){
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                String customerName = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double totalPrice = count * price;
                income += totalPrice;

                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);

            }

            line = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }

}
