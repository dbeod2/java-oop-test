package example;

public class Menu {
  private final String menu;

  private OnClickListener onClickListener;

  public Menu(String menu) {
    this.menu = menu;
  }

  public String getMenu() {
    return menu;
  }

  public void setOnClickListener(OnClickListener onClickListener) {
    this.onClickListener = onClickListener;
  }
}
