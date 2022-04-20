import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command;
        while (!"end".equals(command = scanner.nextLine())) {
            String[] data = command.split(" ");
            if (command.contains("Add")) {
                wagons.add(Integer.parseInt(data[1]));
            } else {
                int passengersToAdd = Integer.parseInt(data[0]);

                for (int i = 0; i < wagons.size(); i++) {

                    if (wagons.get(i) + passengersToAdd <= maxCapacity) {
                        wagons.set(i, passengersToAdd + wagons.get(i));
                        break;
                    }
                }
            }
        }
        wagons.forEach(el-> System.out.print(el + " "));
    }
}
