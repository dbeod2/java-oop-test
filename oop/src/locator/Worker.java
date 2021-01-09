package locator;

public class Worker {
  private JobQueue jobQueue;
  private Transcoder transcoder;

  private boolean someRunningCondition;

  private Worker(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public static Worker of(JobQueue jobQueue, Transcoder transcoder) {
    return new Worker(jobQueue, transcoder);
  }

  public void run() {
    while (someRunningCondition) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcode(jobData.getSource(), jobData.getTarget());
    }
  }
}
