public class Button {

  private final String button;
  private OnClickListener onClickListener;

  public Button(String button1) {
    this.button = button1;
  }

  public void setOnClickListener(OnClickListener onClickListener) {
    this.onClickListener = onClickListener;

  }
}
