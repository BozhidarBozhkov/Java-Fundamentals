import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte length = Byte.parseByte(scanner.nextLine());
        String command = scanner.nextLine();

        String bestDnaSample = "";
        int dnaMaxLength = 0;
        int dnaMaxSum = 0;
        int bestDnaPosition = 0;
        int counter = 0;
        int bestCountDna = 0;
        String[] result = new String[length];

        while (!command.equals("Clone them!")){
            counter++;
            String dnaSequence = command.replaceAll("!", "");
            //10110
            String[] dna = dnaSequence.split("0");
            int currentLength = 0;
            int sumElements = 0;
            int currentPosition = 0;
            for (int i = 0; i < dna.length; i++) {
                sumElements += dna[i].length();
                if (dna[i].length() > currentLength ){
                    currentLength = dna[i].length();
                    bestDnaSample = dna[i];
                }
            }
            currentPosition = dnaSequence.indexOf(bestDnaSample);

            if (currentLength > dnaMaxLength){
                dnaMaxLength = currentLength;
                dnaMaxSum = sumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = counter;
                result = dnaSequence.split("");
            } else if (currentLength == dnaMaxLength && (bestDnaPosition > currentPosition || sumElements > dnaMaxSum)){
                dnaMaxLength = currentLength;
                dnaMaxSum = sumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = counter;
                result = dnaSequence.split("");
            } else if (counter == 1){
                dnaMaxLength = currentLength;
                dnaMaxSum = sumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = counter;
                result = dnaSequence.split("");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCountDna, dnaMaxSum);
        System.out.println(String.join(" ", result));
    }
}
