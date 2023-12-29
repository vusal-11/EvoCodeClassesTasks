package NewTask;

public class PayPal extends CreditCard{
    @Override
    public boolean processPayment(double amount) {
        return true;
    }

    @Override
    public String getProviderName() {
        return "Salam";
    }
}
