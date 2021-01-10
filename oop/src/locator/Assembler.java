package locator;

public class Assembler {
  private Worker worker;
  private JobCLI jobCLI;

  public void createAndWire() {
    //어플리케이션에서 사용할 객체를 생성하고 생성자를 이용해 의존 객체를 전달
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();
    this.worker = new Worker();

    //설정 객체로 의존 객체 받음
    this.worker.setJobQueue(jobQueue);
    this.worker.setTranscoder(transcoder);

    this.jobCLI = new JobCLI(jobQueue);
  }

  public Worker getWorker() {
    return worker;
  }

  public JobCLI getJobCLI() {
    return jobCLI;
  }
}
