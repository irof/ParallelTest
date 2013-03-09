import org.junit.Test;

public class FastTest2 {

  @Test
  public void test1() {
    // success
  }

  @Test
  public void test2() {
    // success
  }

  @Test
  public void test3() {
    throw new AssertionError("fail");
  }
}
