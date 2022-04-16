import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String[] elements = scanner.nextLine().split(" ");
        int[] elements = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e->Integer.parseInt(e))
                .toArray();
        int counter = 1;
        int maxSequence = 0;
        int currentDigit = 0;

        for (int i = 1; i < elements.length; i++) {

            if (elements[i] == elements[i - 1]){
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxSequence){
                maxSequence = counter;
                currentDigit = elements[i];
            }
        }
        for (int i = 0; i < maxSequence; i++) {
            System.out.print(currentDigit + " ");
        }
    }
}