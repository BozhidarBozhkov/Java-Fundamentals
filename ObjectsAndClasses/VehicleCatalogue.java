import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    static class Vehicle {
        String vehicleType;
        String model;
        String color;
        int horsePower;

        public Vehicle(String vehicleType, String model, String color, int horsePower) {
            this.vehicleType = vehicleType;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getVehicleType() {
            return this.vehicleType;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d", getVehicleType().toUpperCase().charAt(0) + getVehicleType().substring(1),
                    this.model, this.color, this.horsePower);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");

            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String model = line;

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            line = scanner.nextLine();
        }

        List<Vehicle> cars = vehicleList.stream().filter(vehicle -> vehicle.getVehicleType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> truck = vehicleList.stream().filter(vehicle -> vehicle.getVehicleType().equals("truck"))
                .collect(Collectors.toList());

        double carsAvgHp = avgHp(cars);
        double trucksAvgHp = avgHp(truck);
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvgHp);
    }

    static double avgHp(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }

}
