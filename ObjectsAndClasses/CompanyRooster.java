import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyRooster {
    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;
    }
    static class Department{
        List<Employee> employeeList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

        }
    }

}
