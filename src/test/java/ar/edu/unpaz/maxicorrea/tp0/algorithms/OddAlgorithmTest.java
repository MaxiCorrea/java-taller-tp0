package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class OddAlgorithmTest {

  private OddAlgorithm algorithm;
  
  @Before
  public void setup() {
    algorithm = new OddAlgorithm();
  }
  
  @Test
  public void shouldReturnAllOddNumbersSeparatedBySemicolons() {
    Line line = new Line(0 ,"18;45,6;45;2;4;56.7;3");
    String expected = "45;3;";
    assertEquals(expected , algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainEvenNumbers() {
    Line line = new Line(0 ,"asdsad");
    String expected = "";
    assertEquals(expected , algorithm.execute(line));
  }
  

}
