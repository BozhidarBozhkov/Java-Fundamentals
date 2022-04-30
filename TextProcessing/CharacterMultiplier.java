import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        char[] firstText = data[0].toCharArray();
        char[] secondText = data[1].toCharArray();

        int smallerString = Math.min(firstText.length, secondText.length);
        int biggerString = Math.max(firstText.length, secondText.length);
        int sum = 0;

        for (int i = 0; i < biggerString; i++) {
            if (i < smallerString){
                sum += firstText[i] * secondText[i];
            } else if (firstText.length > secondText.length){
                sum += firstText[i];
            } else {
                sum += secondText[i];
            }
        }
        System.out.println(sum);
    }

}
