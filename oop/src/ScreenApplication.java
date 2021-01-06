import java.awt.*;

public class ScreenApplication {
  private Menu menu1 = new Menu("menu1");
  private Menu menu2 = new Menu("menu2");
  private Menu menu3 = new Menu("menu3");
  private Button button = new Button("button1");

  private ScreenUiInterface currentScreen = null;

  public ScreenApplication() {
    menu1.setOnClickListener(menuListener);
    menu2.setOnClickListener(menuListener);
    button.setOnClickListener(buttonListener);
  }

  private OnClickListener menuListener = new OnClickListener() {
    public void clicked(Component eventSource) {
      if(eventSource.getName().equals("menu1")) {
        currentScreen = new FirstMenuScreenUi();
      } else if(eventSource.getName().equals("menu2")) {
        currentScreen = new SecondMenuScreenUi();
      } else if(eventSource.getName().equals("menu3")) {
        currentScreen = new ThirdMenuScreenUi();
      }
      currentScreen.show();
    }
  };

  private OnClickListener buttonListener = new OnClickListener() {
    public void clicked(Component eventSource) {
      if(currentScreen == null) {
        return;
      }

      if(eventSource.getName().equals("button1")) {
        currentScreen.handleButtonFirstClick();
      } else {
        currentScreen.handleButtonSecondClick();
      }
    }
  };
}
