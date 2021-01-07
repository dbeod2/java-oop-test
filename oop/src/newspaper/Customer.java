package newspaper;

public class Customer {
  private final Wallet wallet;

  private Customer(Wallet wallet) {
    this.wallet = wallet;
  }

  public static Customer of(int money) {
    return new Customer(Wallet.of(money));
  }

  public Wallet getWallet() {
    return wallet;
  }

  public int getPayment(int payment) {
    if (wallet == null || wallet.getMoney() == 0) {
      throw new NotEnoughMoneyException();
    }
    if (wallet.getMoney() >= payment) {
      wallet.subtractMoney(payment);
    }
    return wallet.getMoney();
  }
}
