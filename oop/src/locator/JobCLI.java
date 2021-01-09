package locator;

public class JobCLI {
  private JobQueue jobQueue;

  public JobCLI(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }

  public void interact() {
    String source = "abc";
    int target = 1;
    jobQueue.addJob(new JobData(source, target));
  }
}
