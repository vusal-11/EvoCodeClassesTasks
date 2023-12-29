package NewTask;

public interface PaymentMethod {
    boolean processPayment(double amount);
    String getProviderName();

}
