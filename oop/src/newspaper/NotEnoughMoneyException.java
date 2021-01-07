package newspaper;

public class NotEnoughMoneyException extends IllegalArgumentException {
  public NotEnoughMoneyException() {
    super("지불 할 돈이 없습니다.");
  }
}
