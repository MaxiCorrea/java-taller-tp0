package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class MaximumAlgorithmTest {

  private MaximumAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new MaximumAlgorithm();
  }
  
  @Test
  public void shouldReturnTheValidMaximumValueOfTheLine() {
    Line line = new Line(0, "1;5;7;-67;8;100;5;324dsfsd");
    String expected = "100";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected  , algorithm.execute(line));
  }
  
}
