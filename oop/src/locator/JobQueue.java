package locator;

public interface JobQueue {

  static JobQueue getInstance() {
    return new DbJobQueue();
  }

  void addJob(JobData jobData);

  JobData getJob();
}
