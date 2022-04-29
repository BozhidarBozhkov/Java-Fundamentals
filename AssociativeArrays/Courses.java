import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();


        while (!line.equals("end")) {
            String[] data = line.split(" : ");
            String courseName = data[0];
            String studentName = data[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(studentName);

            line = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
        .forEach(e -> {System.out.println(e.getKey() + ": " + e.getValue().size());
            e.getValue().stream().forEach(s -> System.out.println("-- " + s));
        });
    }

}
