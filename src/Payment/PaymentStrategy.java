package Payment;


public interface  PaymentStrategy
{
    void pay(double amount);
    String getPaymentDetails();
}
