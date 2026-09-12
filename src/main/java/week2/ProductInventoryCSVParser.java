package week2;

public class ProductInventoryCSVParser {

    public static void main(String[] args) {

        String data = "101,Keyboard,25\n102,Mouse,40\n103,Monitor,15";

        String[] products = data.split("\n");

        for (String product : products) {

            String[] details = product.split(",");

            int id = Integer.parseInt(details[0]);
            String name = details[1];
            int quantity = Integer.parseInt(details[2]);

            System.out.println(
                "ID: " + id +
                ", Product: " + name +
                ", Quantity: " + quantity
            );
        }
    }
}