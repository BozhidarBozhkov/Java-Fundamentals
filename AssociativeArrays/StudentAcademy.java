import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());


            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(grade);

        }
        students.forEach((key, value) -> {
            double averageGrade = value.stream()
                    .mapToDouble(g -> g).average().getAsDouble();
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.02f%n", key, averageGrade);
            }
        });
    }

}
