package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class RepeatedAlgorithmTest {

  private RepeatedAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new RepeatedAlgorithm();
  }
  
  @Test
  public void shouldReturnTheRepeatedNumbersOfTheValidNumbersSeparatedBySemicolons() {
    Line line = new Line(0,"5;6;5;5234,adfdf;56;90;6");
    String expected = "5;6;";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected  , algorithm.execute(line));
  }
  
}
