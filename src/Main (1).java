import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomerSteven = new RegularCustomer("Steven");
        RegularCustomer regularCustomerJack = new RegularCustomer("Jack");
        PremiumCustomer premiumCustomerJeff = new PremiumCustomer("Jeff");

        CreditCardPayment stevenCreditCard = new CreditCardPayment("1234", regularCustomerSteven.name);
        PayPalPayment jackPayPal = new PayPalPayment(regularCustomerJack.name + ".123" + "@gmail.com");
        BitcoinPayment jeffBitCoin = new BitcoinPayment("abcwallet@dotdot");

        regularCustomerSteven.displayCustomerInfo();
        System.out.println("--------------------");
        regularCustomerJack.displayCustomerInfo();
        System.out.println("--------------------");
        premiumCustomerJeff.displayCustomerInfo();
        System.out.println("--------------------");

        regularCustomerSteven.makePayment(stevenCreditCard, 500);
        System.out.println("--------------------");
        regularCustomerSteven.makePayment(stevenCreditCard, 1500);
        System.out.println("--------------------");

        regularCustomerJack.makePayment(jackPayPal, 80);
        System.out.println("--------------------");
        regularCustomerJack.makePayment(jackPayPal, 10);
        System.out.println("--------------------");

        premiumCustomerJeff.makePayment(jeffBitCoin, 35000);
        System.out.println("--------------------");
        premiumCustomerJeff.makePayment(jeffBitCoin, 600000);
        System.out.println("--------------------");

        regularCustomerSteven.showPaymentHistory();
        System.out.println("--------------------");
        regularCustomerJack.showPaymentHistory();
        System.out.println("--------------------");
        premiumCustomerJeff.showPaymentHistory();
        System.out.println("--------------------");
    }
}