import java.awt.*;

public class ScreenApplication {
  private final Menu menu1 = new Menu("menu1");
  private final Menu menu2 = new Menu("menu2");
  private final Button button = new Button("button1");

  private ScreenUiInterface currentScreen = null;

  public ScreenApplication() {
    menu1.setOnClickListener(menuListener);
    menu2.setOnClickListener(menuListener);
    button.setOnClickListener(buttonListener);
  }

  private final OnClickListener menuListener = new OnClickListener() {
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

  private final OnClickListener buttonListener = new OnClickListener() {
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
