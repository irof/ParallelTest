import org.junit.Test;
import static org.junit.Assert.*;
import static java.util.concurrent.TimeUnit.*;

public class SlowTest2 {

  @Test
  public void test1() throws Exception {
    SECONDS.sleep(2);
  }

  @Test
  public void test2() throws Exception {
    SECONDS.sleep(3);
    fail();
  }

  @Test
  public void test3() throws Exception {
    SECONDS.sleep(4);
  }
}
