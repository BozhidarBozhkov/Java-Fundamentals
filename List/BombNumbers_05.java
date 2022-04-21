import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        int specialNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        while (numbers.contains(specialNumber)) {
            int bombIndex = numbers.indexOf(specialNumber);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0){
                start = 0;
            }
            if (end >= numbers.size()){
                end = numbers.size() - 1;
            }

            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

}
