package Payment;

public class BitcoinPayment implements PaymentStrategy{
    String WalletAddress;

    public BitcoinPayment(String walletAddress)
    {
        this.WalletAddress = walletAddress;
    }
    @Override
    public void pay(double amount)
    {
        System.out.println("the amount of " + amount + " was paid with BitCoin : " + WalletAddress);
    }
    @Override
    public String getPaymentDetails()
    {
        return ": " + WalletAddress;
    }
}
