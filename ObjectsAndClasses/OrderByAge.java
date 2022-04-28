import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class People {
        String name;
        String id;
        int age;

        public People(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old."
                    , this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<People> peopleList = new ArrayList<>();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");

            People people = new People(data[0], data[1], Integer.parseInt(data[2]));
            peopleList.add(people);

            line = scanner.nextLine();
        }

        peopleList.stream().sorted((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge())).forEach(people -> System.out.println(people.toString()));

    }

}
