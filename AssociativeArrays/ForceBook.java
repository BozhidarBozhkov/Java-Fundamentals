import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!line.equals("Lumpawaroo")){
            if (line.contains("|")){
                String[] data = line.split("\\s+\\|\\s+");
                String forceSide = data[0];
                String forceUser = data[1];
                forceBook.putIfAbsent(forceSide, new ArrayList<>());

                boolean noMatch = forceBook.entrySet()
                        .stream().noneMatch(entry -> entry.getValue().contains(forceUser));

                if (noMatch){
                    forceBook.get(forceSide).add(forceUser);
                }
            } else if (line.contains("->")){
                String[] data = line.split("\\s+->\\s+");
                String forceUser = data[0];
                String forceSide = data[1];

                forceBook.forEach((k, v) -> v.remove(forceUser));
                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            line = scanner.nextLine();
        }
        forceBook.forEach((k, v)-> {
            if (v.size() != 0){
                System.out.printf("Side: %s, Members: %s%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
    }

}
