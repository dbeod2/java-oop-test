package locator;

public class Application {
  //메인 영역의 코드 : 어플리케이션 영역의 객체 초기화, 의존처리,실행 담당
  // 모든 의존은 메인 영역에서 어플리케이션 영역으로 향함. 반대의 경우는 존재하지 않는다.( why : 메인을 변경해도 어플리케이션은 변경되지 않는다 .)
  public static void main(String[] args) {
    new MyServiceLocator();

    Worker worker = new Worker();
    Thread t = new Thread(() -> worker.run());
    JobCLI jobCLI = new JobCLI();
    jobCLI.interact();

    System.out.println(t);
  }
}
