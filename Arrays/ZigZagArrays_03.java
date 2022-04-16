import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String[] first = new String[lines];
        String[] second = new String[lines];
        for (int i = 1; i <= lines; i++) {
            String[] elements = scanner.nextLine().split(" ");
            if (i % 2 != 0){
                first[i - 1] = elements[0];
                second[i - 1] = elements[1];
            } else {
                second[i - 1] = elements[0];
                first[i - 1] = elements[1];
            }
        }
        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ", second));

    }

}
