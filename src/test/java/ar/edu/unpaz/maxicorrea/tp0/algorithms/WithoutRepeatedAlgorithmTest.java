package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class WithoutRepeatedAlgorithmTest {

  private WithoutRepeatedAlgorithm algorithm;

  @Before
  public void setup() {
    algorithm = new WithoutRepeatedAlgorithm();
  }

  @Test
  public void shouldReturnValidNumbersWithoutRepeatedSeparatedBySemicolons() {
    Line line = new Line(0, "5;6;7;8;8;7;34;4;");
    String expected = "5;6;7;8;34;4;";
    assertEquals(expected, algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected, algorithm.execute(line));
  }

}
