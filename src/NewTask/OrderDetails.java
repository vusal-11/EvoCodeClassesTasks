package NewTask;

public class OrderDetails {

    private Product product;

    private int quantity;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice()
    {
       return product.price * quantity;
    }

    public OrderDetails() {
    }

    public OrderDetails(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
