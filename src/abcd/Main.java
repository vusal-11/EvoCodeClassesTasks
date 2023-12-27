package abcd;

import InventoryManagement.InventoryManagement;

public class Main {
    public static void main(String[] args) {

        Base base=new Base("Vusal");
        base.showName();
        Child child=new Child("Zidane");
        child.showName();
    }
}
