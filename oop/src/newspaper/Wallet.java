package newspaper;

public class Wallet {
  private int money;

  private Wallet(int money) {
    this.money = money;
  }

  public static Wallet of(int money) {
    return new Wallet(money);
  }
  public int getMoney() {
    return money;
  }

  public void subtractMoney(int debit) {
    System.out.println("debit : " + debit);
    money -= debit;
  }
}
