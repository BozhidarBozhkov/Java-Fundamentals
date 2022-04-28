import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.compare;

public class Students {
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
        @Override
        public String toString(){
            return String.format("%s %s: %.02f", this.firstName, this.lastName, this.grade);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);


            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);

        }
        studentList.stream().sorted((a1, a2) -> Double.compare(a2.getGrade(), a1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }

}
