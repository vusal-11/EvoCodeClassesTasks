package InventoryManagement;

public class Main {
    public static void main(String[] args) {
        InventoryManagement product = new InventoryManagement(101, "Laptop", 1200, 50);
        product.displayInfo();
        product.restock(20);
        product.sell(15);
        System.out.println("Is 10 units available? " + product.checkAvailability(10));
        product.updatePrice(1250);
        product.displayInfo();
        System.out.println("Total value of " + product.getName() + " in stock: $" + product.calculateTotalValue());
        System.out.println("EveryThing Good Sir,Please Call later");
    }

}
