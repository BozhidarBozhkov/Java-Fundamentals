import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int allCourses = 0;
        int course = numberOfPeople / capacity;
        if  (numberOfPeople % capacity == 0){
            allCourses = course;
        } else  {
            allCourses = course + 1;
        }
        if (numberOfPeople < capacity){
            allCourses = 1;
        }
        System.out.println(allCourses);
    }

}
