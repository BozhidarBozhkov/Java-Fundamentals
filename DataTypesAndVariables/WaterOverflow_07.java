import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        byte n = Byte.parseByte(scanner.nextLine());
        int totalQty = 0;
        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > capacity){
                System.out.println("Insufficient capacity!");
              //  quantity = Integer.parseInt(scanner.nextLine());
            } else {
            capacity -= quantity;
            totalQty += quantity;
            }
        }
        System.out.println(totalQty);
    }

}
