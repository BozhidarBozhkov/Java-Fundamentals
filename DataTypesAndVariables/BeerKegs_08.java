import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        byte numberOfKegs = Byte.parseByte(scanner.nextLine());

        String biggestKeg = "";
        double biggestVolume = Double.MIN_VALUE;
        for (int i = 0; i < numberOfKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());


            double volume = Math.PI * radius * radius * height;
            if (volume > biggestVolume){
                biggestVolume = volume;
                biggestKeg = model;
            }

        }
        System.out.println(biggestKeg);
    }

}
