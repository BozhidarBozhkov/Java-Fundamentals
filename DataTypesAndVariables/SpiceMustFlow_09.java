import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int dayCount = 0;
        int totalSpiceMined = 0;
        while (startingYield >= 100) {

            dayCount++;
            int spiceMined = startingYield;
            int spiceLeft = spiceMined - 26;
            totalSpiceMined += spiceLeft;

            startingYield -= 10;
        }
        if (totalSpiceMined >= 26) {
            totalSpiceMined -= 26;
        }
        System.out.println(dayCount);
        System.out.println(totalSpiceMined);
    }
}
