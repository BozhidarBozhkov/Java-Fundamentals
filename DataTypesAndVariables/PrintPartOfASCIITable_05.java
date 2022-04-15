import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startIndex = scanner.nextLine();
        String endIndex = scanner.nextLine();

        for (int i = Integer.parseInt(startIndex); i <= Integer.parseInt(endIndex) ; i++) {
            char current = (char) i;
            System.out.print(current + " ");
        }
    }

}
