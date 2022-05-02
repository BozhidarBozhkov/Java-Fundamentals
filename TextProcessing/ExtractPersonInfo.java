import java.util.Scanner;

public class ExtractPersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            int indexStartName = line.indexOf("@");
            int indexEndName = line.indexOf("|");
            String name = line.substring(indexStartName + 1, indexEndName);

            int ageStartIndex = line.indexOf("#");
            int ageEndIndex = line.indexOf("*");
            String age = line.substring(ageStartIndex + 1, ageEndIndex);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }

}
