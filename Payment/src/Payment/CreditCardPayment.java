package Payment;

public class CreditCardPayment implements PaymentStrategy {
     String CardNumber;
     String CardHolderName;

     public CreditCardPayment(String cardNumber)
     {
         this.CardNumber = cardNumber;

     }
      @Override
     public void pay(double amount)
      {
          System.out.println("the amount of " + amount + " was paid with the Credit Card : " + CardNumber);
      }
      @Override
     public String getPaymentDetails()
      {
          return ": "  + CardNumber;
      }
}
