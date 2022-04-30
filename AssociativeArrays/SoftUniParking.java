import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];

            switch (command){
                case "register":
                    String plateNumber = data[2];
                    if (users.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    } else {
                        users.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    }
                    break;
                case "unregister":
                    if (!users.containsKey(name)){
                        System.out.println("ERROR: user " + name + " not found");
                    } else {
                        users.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                    break;
            }
        }
        users.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }

}
