import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] data = command.split(" ");
            if (data[0].equals("Delete")){
                for (int i = 0; i < numbers.size(); i++) {
                    int element = Integer.parseInt(data[1]);
                    if (numbers.get(i) == element){
                        numbers.remove(i);
                        i--;
                    }
                }
            } else  {
                    int element = Integer.parseInt(data[1]);
                    int position = Integer.parseInt(data[2]);
                    numbers.add(position, element);
            }
            command = scanner.nextLine();
        }
        numbers.forEach(el-> System.out.print(el + " "));
    }
}
