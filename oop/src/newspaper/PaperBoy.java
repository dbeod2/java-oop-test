package newspaper;

public class PaperBoy {
  private final Customer customer;

  public PaperBoy(Customer customer) {
    this.customer = customer;
  }

  //디미터 법칙 적용 전
  public int getWalletPayment() {
    int payment = 1000;
    Wallet wallet = customer.getWallet();
    if (wallet.getMoney() >= payment) {
      wallet.subtractMoney(payment);
    }
    return customer.getWallet().getMoney();
  }

  //디미터 법칙 적용
  public int getPayment() {
    return customer.getPayment(1000);
  }
}
