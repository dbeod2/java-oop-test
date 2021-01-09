package locator;

// 의존 객체를 찾을 때 사용되는 locator의 구현 예시
public class Locator {
  private static Locator instance;
  private JobQueue jobQueue;
  private Transcoder transcoder;

  public Locator(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public static Locator getInstance() {
    return instance;
  }

  public static void init(Locator locator) {
    instance = locator;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }

  public Transcoder getTranscoder() {
    return transcoder;
  }
}
