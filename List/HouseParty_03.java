import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(" ");
            String name = data[0];
            if (input.contains("is going")) {
                if (nameList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    nameList.add(name);
                }
            } else {
                if (!nameList.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    nameList.remove(name);
                }
            }
        }
        nameList.forEach(el-> System.out.println(el + " "));
    }
}
