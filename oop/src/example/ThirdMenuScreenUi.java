package example;

public class ThirdMenuScreenUi implements ScreenUiInterface {
  @Override
  public void show() {
    System.out.println("세번째 메뉴 화면으로 전환 ");
  }

  @Override
  public void handleButtonFirstClick() {

  }

  @Override
  public void handleButtonSecondClick() {
    System.out.printf("세번째 화면 버튼3 처리");
  }
}
