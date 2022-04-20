import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double result = findFactorial1(num1)  / findFactorial2(num2);
            System.out.printf("%.2f", result);

    }

    public static double findFactorial1(int num1) {
        double result = 1;
        if (num1 == 0) {
            return result;
        } else {
            for (int i = 1; i <= num1; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static double findFactorial2(int num2) {
        double result = 1;
        if (num2 == 0) {
            return result;
        } else {
            for (int i = 1; i <= num2; i++) {
                result *= i;
            }
        }
        return result;
    }
}
