package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class ValidAlgorithmTest {

  private ValidAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new ValidAlgorithm();
  }
  
  @Test
  public void shouldReturnTheValidNumbersOfTheLineSeparatedBySemicolons() {
    Line line = new Line(0, "345;7.8;asdasd;-78.9;7;");
    String expected = "345;7;";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected, algorithm.execute(line));
  }
  
}
