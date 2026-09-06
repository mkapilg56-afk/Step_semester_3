package week1;

public class InventoryBalancer {

    public static void main(String[] args) {

        int[] warehouseA = {50, 30, 40, 25};
        int[] warehouseB = {40, 35, 40, 20};

        for (int i = 0; i < warehouseA.length; i++) {

            if (warehouseA[i] > warehouseB[i]) {
                System.out.println("Item " + (i + 1) + ": Warehouse A has more");

            } else if (warehouseB[i] > warehouseA[i]) {
                System.out.println("Item " + (i + 1) + ": Warehouse B has more");

            } else {
                System.out.println("Item " + (i + 1) + ": Both warehouses have the same quantity");
            }
        }
    }
}