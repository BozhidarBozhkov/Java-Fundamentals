import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(arrays);
        String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);
    }
}

//        List<String> arr = Arrays.stream(scanner.nextLine().split("|")).collect(Collectors.toList());
//
//        List<String> output = new ArrayList<>();
//
//        for (int i = arr.size() - 1; i >= 0; i--) {
//            String[] numbers = arr.get(i).split("\\s+");
//            for (int j = 0; j < numbers.length; j++) {
//                if (!numbers[j].equals("")){
//                    output.add(numbers[j]);
//                }
//            }
//        }
//        String toPrint = output.toString().trim();
//        System.out.println(toPrint.replaceAll("\\[|,|\\]", ""));
//    }

