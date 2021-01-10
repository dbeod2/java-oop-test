package locator;

public class MyServiceLocator extends ServiceLocatorAbstract {

  private FileJobQueue jobQueue;
  private FfmpegTranscoder transcoder;

  public MyServiceLocator() {
    super();
    this.jobQueue = new FileJobQueue();
    this.transcoder = new FfmpegTranscoder();
  }
  @Override
  public JobQueue jobQueue() {
    return jobQueue;
  }

  @Override
  public Transcoder transcoder() {
    return transcoder;
  }
}
