import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        printSmallestOfThreeNums(num1, num2, num3);

    }

    public static void printSmallestOfThreeNums (int num1, int num2, int num3){
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

    }
}
