package example;

public class FirstMenuScreenUi implements ScreenUiInterface {
  @Override
  public void show() {
    System.out.println("첫번째 메뉴 화면으로 전환 ");
  }

  @Override
  public void handleButtonFirstClick() {

  }

  @Override
  public void handleButtonSecondClick() {
    System.out.printf("첫번째 화면 버튼1 처리");
  }
}
