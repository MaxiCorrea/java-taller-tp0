package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class FactorialAlgorithmTest {

  private FactorialAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new FactorialAlgorithm();
  }
  
  @Test
  public void shouldReturnTheFactorialOfTheMaximumValidNumberOfTheLine() {
    Line line = new Line(0, "asdsd;5;2;5;6;7.5;");
    String expected = "720";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnZeroIfTheFactorialCanNotBeCalculated() {
    Line line = new Line(0, "asdsd;-5;-2;-5;-6;7.5;");
    String expected = "";
    assertEquals(expected , algorithm.execute(line));
  }
  
}
