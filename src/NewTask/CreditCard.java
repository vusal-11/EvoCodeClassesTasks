package NewTask;

public class CreditCard implements PaymentMethod {

    private String cardNumber;
    private String expiryDate;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Credit Card.");
        return true;
    }

    @Override
    public String getProviderName() {
        return null;
    }
}

