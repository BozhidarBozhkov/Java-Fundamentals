import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    static class Product{
        String name;
        Double price;
        Double quantity;

        public Product(String name, Double price, Double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Product> orders = new LinkedHashMap<>();

        while (!line.equals("buy")){
            String[] data = line.split("\\s+");
            String name = data[0];
            Double price = Double.parseDouble(data[1]);
            Double quantity = Double.parseDouble(data[2]);

            if (orders.containsKey(name)){
                orders.get(name).setPrice(price);
                orders.get(name).setQuantity(orders.get(name).getQuantity() + quantity);
            } else{
                orders.put(name, new Product(name, price, quantity));
            }

            line = scanner.nextLine();
        }
        orders.forEach((k, v) -> System.out.printf("%s -> %.02f%n", k, v.getPrice() * v.getQuantity()));
    }

}
