package locator;

public class Worker {
  private JobQueue jobQueue;
  private Transcoder transcoder;

  private boolean someRunningCondition;

  public void configure(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  //method chaining ( 메서드가 객체를 반환하게 되면, 메서드의 반환 값인 객체를 통해 또 다른 함수를 호출 )
  public Worker setJobQueue(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
    return this;
  }

  public Worker setTranscoder(Transcoder transcoder) {
    this.transcoder = transcoder;
    return this;
  }

  public void run() {
    JobQueue jobQueue = JobQueue.getInstance();
    while (someRunningCondition) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcode(jobData.getSource(), jobData.getTarget());
    }
  }
}
