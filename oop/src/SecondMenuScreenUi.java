public class SecondMenuScreenUi implements ScreenUiInterface {
  @Override
  public void show() {
    System.out.println("두번째 메뉴 화면으로 전환 ");
  }

  @Override
  public void handleButtonSecondClick() {
    System.out.printf("두번째 화면 버튼2 처리");
  }
}
