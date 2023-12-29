package NewTask;

import java.util.List;

public class OrderClass {

    private List<OrderDetails> orderDetails;

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }


    public void addProduct(Product product,int quantity){
        orderDetails.add(new OrderDetails(product,quantity));
    }

    public  double getTotalAmount(){
        double summ=0;
        for (OrderDetails orderDetail : orderDetails) {
            summ +=orderDetail.getTotalPrice();
        }
        return  summ;
    }

}
