import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char symbol = (char) (line.charAt(i) + 3);
            sb.append(symbol);
        }
        System.out.println(sb);
    }

}
