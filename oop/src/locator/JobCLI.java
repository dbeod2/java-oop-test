package locator;

public class JobCLI {
  private JobQueue jobQueue;

  public JobCLI() {

  }

  //의존 객체 전달 받음
  public JobCLI(JobQueue jobQueue) {
    //객체 생성 시점에서 의존 객체가 완전한지 확인할 수 있음.
    validate(jobQueue);
    this.jobQueue = jobQueue;
  }

  private static void validate(JobQueue jobQueue) {
    if (jobQueue == null) {
      throw new IllegalArgumentException();
    }
  }

  public void interact() {
    String source = "abc";
    int target = 1;
    JobQueue jobQueue = ServiceLocatorAbstract.getInstance().jobQueue();
    jobQueue.addJob(new JobData(source, target));
  }
}
