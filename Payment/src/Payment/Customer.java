package Payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;
     public Customer(String name)
     {
         this.name = name;
         this.paymentHistory = new ArrayList<>();
     }
     public abstract void displayCustomerInfo();

     public void makePayment(PaymentStrategy paymentStrategy, double amount)
    {
      paymentStrategy.pay(amount);
      String paymentInfo = "the amount of " + amount + " was paid with : " +paymentStrategy.getPaymentDetails() ;
      paymentHistory.add(paymentInfo);
    }

    public void showPaymentHistory() {
         System.out.println("the payment history of : " + name);
         for(String record : paymentHistory)
         {
             System.out.println(record);
         }
    }
}
