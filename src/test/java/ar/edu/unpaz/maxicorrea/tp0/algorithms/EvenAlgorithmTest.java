package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class EvenAlgorithmTest {

  private EvenAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new EvenAlgorithm();
  }
  
  @Test
  public void shouldReturnAllEvenNumbersSeparatedBySemicolons() {
    Line line = new Line(0 ,"18;45,6;45;2;4;56.7");
    String expected = "18;2;4;";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainEvenNumbers() {
    Line line = new Line(0 ,"asdsad");
    String expected = "";
    assertEquals(expected , algorithm.execute(line));
  }
  
}
