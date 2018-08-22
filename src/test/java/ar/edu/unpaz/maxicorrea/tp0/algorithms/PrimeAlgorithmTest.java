package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class PrimeAlgorithmTest {

  private PrimeAlgorithm algorithm;

  @Before
  public void setup() {
    algorithm = new PrimeAlgorithm();
  }

  @Test
  public void shouldReturnThePrimeNumbersOfValidNumbersSeparatedBySemicolons() {
    Line line = new Line(0, "100;2;5;10;13;10;-67;47");
    String expected = "2;5;13;47;";
    assertEquals(expected, algorithm.execute(line));
  }

  @Test
  public void shouldReturnEmptyIfTheLineDoesNotContainValidValues() {
    Line line = new Line(0, "324dsfsd;67.7");
    String expected = "";
    assertEquals(expected, algorithm.execute(line));
  }

}
