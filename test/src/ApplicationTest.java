import locator.JobQueue;
import locator.Transcoder;
import locator.Worker;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ApplicationTest {

  @Test
  public void shouldRunSuccessfully() {
    JobQueue jobQueue = mock(JobQueue.class);
    Transcoder transcoder = mock(Transcoder.class);

    Worker worker = new Worker();
    worker.setTranscoder(transcoder);
    worker.setJobQueue(jobQueue);
    worker.run();
  }
}
