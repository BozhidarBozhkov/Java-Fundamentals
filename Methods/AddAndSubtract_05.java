import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int result = subtractFirstTwoFromThird(num1, num2, num3);
        System.out.println(result);

    }
    public static int subtractFirstTwoFromThird(int num1, int num2, int num3){
        return (num1 + num2) - num3;
    }


}
