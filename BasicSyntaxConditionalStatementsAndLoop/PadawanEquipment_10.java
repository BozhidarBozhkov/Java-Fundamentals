import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = numberOfStudents / 6;
        double allStudents = Math.ceil(numberOfStudents + numberOfStudents * 0.1);
        double totalCost = allStudents * lightsaberPrice
        + numberOfStudents * robePrice + (numberOfStudents - freeBelts) * beltPrice;

        if (totalCost <= availableMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else  {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalCost - availableMoney));
        }
    }
}
