package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class NaturalOrderAlgorithmTest {

  private NaturalOrderAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new NaturalOrderAlgorithm();
  }
  
  @Test
  public void shouldReturnValidNumbersOrderedFromLowestToHighestSeparatedBySemicolons() {
    Line line = new Line(0, "45n;7;8;-6;7;8;-10");
    String expected = "-10;-6;7;7;8;8;";
    assertEquals(expected, algorithm.execute(line));
  }
  
  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected  , algorithm.execute(line));
  }
}
