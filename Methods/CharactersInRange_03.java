import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        charsInRange(start, end);
    }

    public static void charsInRange(char start, char end) {
        if (start > end){
            char temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i < end - 1; i++) {
            char symbol = (char) (i + 1);
            System.out.print(symbol + " ");
        }
    }

}
