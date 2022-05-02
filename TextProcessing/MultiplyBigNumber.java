import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        for (int i = line.length() - 1; i >= 0 ; i--) {
            int digit = Integer.parseInt(String.valueOf(line.charAt(i)));
            int product = number * digit + remainder;
            if (i == 0){
                sb.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                remainder = product / 10;
                sb.insert(0, digitToAdd);
            }
        }
        while (sb.charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }

}
