import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        boolean isValid = false;
        int validIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
         int leftSum = 0;
         int rightSum = 0;
            for (int j = i; j >= 0 ; j--) {
                    leftSum += Integer.parseInt(numbers[j]);
            }
            for (int j = i; j < numbers.length ; j++) {
                    rightSum += Integer.parseInt(numbers[j]);
            }
            leftSum -= Integer.parseInt(numbers[i]);
            rightSum -= Integer.parseInt(numbers[i]);

            if (leftSum == rightSum){
                isValid = true;
                validIndex = i;
                break;
            }
        }
        if (isValid){
        System.out.println(validIndex);
        } else  {
            System.out.println("no");
        }
    }

}
