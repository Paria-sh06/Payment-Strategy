package Payment;

public class PayPalPayment implements PaymentStrategy {
    String Email;

    public PayPalPayment(String email) {
        this.Email = email;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("the amount of " + amount + " was paid with email : " + Email);
    }

    @Override
    public String getPaymentDetails()
    {
        return ": " + Email;
    }
}
