package newspaper;

public class NewsPaperApplication {
  private static final int TOTAL_MONEY = 0;

  public static void main(String[] args) {
    System.out.println("before total money : " + TOTAL_MONEY);
    PaperBoy paperBoy = new PaperBoy(Customer.of(TOTAL_MONEY));
    System.out.println("after total money : " + paperBoy.getPayment());
  }
}
