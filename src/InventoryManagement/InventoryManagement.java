package InventoryManagement;

public class InventoryManagement {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public InventoryManagement(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void restock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println(name + " has been restocked. Current quantity: " + this.quantity);
        } else {
            System.out.println("Invalid restock amount aqilli ol. Please provide a positive quantity.");
        }
    }

    public void sell(int quantityToSell) {
        if (quantityToSell > 0 && quantityToSell <= this.quantity) {
            this.quantity -= quantityToSell;
            System.out.println(quantityToSell + " units of " + name + " have been sold. Remaining quantity: " + this.quantity);
        } else if (quantityToSell > this.quantity) {
            System.out.println("Not enough stock to fulfill the request.");
        } else {
            System.out.println("Invalid quantity for selling. Please provide a positive quantity.");
        }
    }

    public double calculateTotalValue() {
        return this.price * this.quantity;
    }

    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
            System.out.println("Price for " + name + " has been updated to $" + this.price);
        } else {
            System.out.println("Invalid price value. Please provide a positive price.");
        }
    }

    public boolean checkAvailability(int requestedQuantity) {
        return this.quantity >= requestedQuantity;
    }

    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Quantity in Stock: " + this.quantity);
        System.out.println("Sir i can do something");
    }


}
