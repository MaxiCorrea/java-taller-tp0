package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class InvalidAlgorithmTest {

  private InvalidAlgorithm algorithm;

  @Before
  public void setup() {
    algorithm = new InvalidAlgorithm();
  }

  @Test
  public void shouldReturnNonIntegerValuesSeparatedBySemicolons() {
    Line line = new Line(0, "asdsd;5;6;778;23;-6;3434as;78-df;");
    String expected = "asdsd;3434as;78-df;";
    assertEquals(expected, algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfAllTheValuesOfTheLineAreValid() {
    Line line = new Line(0, "5;6;778;23");
    String expected = "";
    assertEquals(expected, algorithm.execute(line));
  }

}
