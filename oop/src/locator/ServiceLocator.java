package locator;

public class ServiceLocator {

  //생성자를 이용해서 객체를 등록 받는 서비스 로케이터 구현

  private JobQueue jobQueue;

  private Transcoder transcoder;

  private static ServiceLocator instance;

  public ServiceLocator(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }

  public Transcoder getTranscoder() {
    return transcoder;
  }

  //서비스 로케이터 접근 위한 메서드

  public static void load(ServiceLocator locator) {
    ServiceLocator.instance = locator;
  }

  public static ServiceLocator getInstance() {
    return instance;
  }
}
