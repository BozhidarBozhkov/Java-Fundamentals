import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double costPerDay = 0;
        switch (day) {
            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    costPerDay = 8.45 * people;
                } else if (typeOfGroup.equals("Business")) {
                    costPerDay = 10.90 * people;
                } else if (typeOfGroup.equals("Regular")) {
                    costPerDay = 15.00 * people;
                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    costPerDay = 9.8 * people;
                } else if (typeOfGroup.equals("Business")) {
                    costPerDay = 15.60 * people;
                } else if (typeOfGroup.equals("Regular")) {
                    costPerDay = 20 * people;
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")) {
                    costPerDay = 10.46 * people;
                } else if (typeOfGroup.equals("Business")) {
                    costPerDay = 16 * people;
                } else if (typeOfGroup.equals("Regular")) {
                    costPerDay = 22.5 * people;
                }
                break;
        }
        if (people >= 30 && typeOfGroup.equals("Students")){
            costPerDay = costPerDay * 0.85;
        }
        if (people >= 100 && typeOfGroup.equals("Business")){
            if (day.equals("Friday")){
                costPerDay = costPerDay - 10 * 10.9;
            } else if (day.equals("Saturday")){
                costPerDay = costPerDay - 10 * 15.6;
            } else if (day.equals("Sunday")){
                costPerDay = costPerDay - 10 * 16.0;
            }
        }
        if (people >= 10 && people <= 20 && typeOfGroup.equals("Regular")){
            costPerDay = costPerDay * 0.95;
        }
        System.out.printf("Total price: %.2f", costPerDay);
    }

}
