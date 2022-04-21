import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] data = line.split(" ");
            if (data[0].equals("Add")) {
                numbers.add(Integer.parseInt(data[1]));
            } else if (data[0].equals("Insert")) {
                int number = Integer.parseInt(data[1]);
                int position = Integer.parseInt(data[2]);
                insertIndex(numbers, position, number);
            } else if (data[0].equals("Remove")) {
                int position = Integer.parseInt(data[1]);
                if (position < 0 || position >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(position);
                }
            } else if (data[0].equals("Shift")) {
                int count = Integer.parseInt(data[2]);
                if (data[1].equals("left")) {
                    for (int i = 0; i < count; i++) {
                        numbers.add(numbers.get(0));
                        numbers.remove(0);
                    }
                } else {
                    for (int i = 0; i < count; i++) {
                        numbers.add(0, numbers.get(numbers.size() - 1));
                        numbers.remove(numbers.size() - 1);
                    }
                }
            }

            line = scanner.nextLine();
        }
        numbers.forEach(el -> System.out.print(el + " "));
    }

    public static void insertIndex(List<Integer> numbers, int index, int number) {
        if (index < 0 || index >= numbers.size()) {
            System.out.println("Invalid index");
        } else {
            numbers.add(index, number);
        }
    }
}
