package locator;

public abstract class ServiceLocatorAbstract {
  //상속을 통한 서비스 로케이터 구현

  // 객체를 구하는 추상 메서드를 제공하는 상위 타입구현
  // 상위 타입을 상속받은 하위 타입에서 사용할 객체 설정

  private static ServiceLocatorAbstract instance = null;

  public abstract JobQueue jobQueue();
  public abstract Transcoder transcoder();

  protected ServiceLocatorAbstract() {
    ServiceLocatorAbstract.instance = this;
  }

  public static ServiceLocatorAbstract getInstance() {
    return instance;
  }
}
