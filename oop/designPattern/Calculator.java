package designPattern;

import java.util.Arrays;
import java.util.List;

public class Calculator {

  private DiscountStrategy discountStrategy;

  //전략패턴 적용 전
  public int calculator(boolean firstGuest, List<Item> itemList) {
    int sum = 0;
    for (Item item : itemList) {
      if (firstGuest) {
        this.discountStrategy.getDiscountPrice(item);
        return sum;
      }

      if (!item.isFresh()) {
        sum += (int) (item.getPrice() * 0.8);
        return sum;
      }
      sum += item.getPrice();
    }
    return sum;
  }

  public Calculator(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  // 가격 계산시 전략패턴 사용
  public int calculator(List<Item> itemList) {
    return itemList.stream()
            .mapToInt(item -> discountStrategy.getDiscountPrice(item))
            .sum();
  }

  public void onFirstGuestDiscountClick() {
    discountStrategy = new FirstGuestDiscountStrategy();
  }

  public void onNonFreshItemDiscountClick() {
    discountStrategy = new NonFreshItemDiscountStrategy();
  }

  public void onCalculationButtonClick() {
    Calculator calculator = new Calculator(discountStrategy);
    List<Item> items = Arrays.asList(new Item(1000));
    int price = calculator.calculator(items);
  }

}
