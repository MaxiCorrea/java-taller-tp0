package ar.edu.unpaz.maxicorrea.tp0.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class LineTest {

  private final String dataLine = "45;67;23;6;asd;67.8;89.7;5a";
  private static final int ONE = 1;
  private Line line;

  @Before
  public void setup() {
    line = new Line(ONE, dataLine);
  }

  @Test
  public void theLineShouldReturnAllValidNumbers() {
    List<Integer> valids = Arrays.asList(45,67,23,6);
    List<Integer> actual = line.getValidNumbers();
    assertEquals(valids , actual);
  }

  @Test
  public void theLineShouldReturnAllInvalidNumbers() {
    List<String> invalids = Arrays.asList("asd","67.8","89.7","5a");
    List<String> actual = line.getInvalids();
    assertEquals(invalids, actual);
  }

  @Test
  public void theLineShouldIndicateIfHaveValidNumbers() {
    line = new Line(ONE, "asdasd");
    assertFalse(line.hasValidNumbers());
    line = new Line(ONE,"1");
    assertTrue(line.hasValidNumbers());
  }

  @Test
  public void theLineShouldReturnYourNumber() {
    line = new Line(ONE, "asdasd");
    assertEquals(ONE , line.getNumber());
    line = new Line(100, "asdasd");
    assertEquals(100 , line.getNumber());
  }

}
