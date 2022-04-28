import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, List<String>> users = new LinkedHashMap<>();

        while (!line.equals("End")) {
            String[] data = line.split(" -> ");
            String company = data[0];
            String employee = data[1];

            if (!users.containsKey(company)) {
                users.put(company, new ArrayList<>());
            }
            if (!users.get(company).contains(employee)) {
                users.get(company).add(employee);
            }

            line = scanner.nextLine();
        }
        users.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream()
                            .forEach(u -> System.out.println("-- " + u));
                });
    }

}
