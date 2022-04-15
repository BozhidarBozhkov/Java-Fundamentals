import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());

        double highestValue = 0;
        double maxSnowSnow = 0;
        double maxSnowTime = 0;
        double maxSnowQual = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > highestValue){
                highestValue = snowballValue;
                maxSnowSnow = snowballSnow;
                maxSnowTime = snowballTime;
                maxSnowQual = snowballQuality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", maxSnowSnow, maxSnowTime, highestValue, maxSnowQual);
    }
}
