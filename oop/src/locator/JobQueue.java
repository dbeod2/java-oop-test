package locator;

public interface JobQueue {
  void addJob(JobData jobData);

  JobData getJob();
}
