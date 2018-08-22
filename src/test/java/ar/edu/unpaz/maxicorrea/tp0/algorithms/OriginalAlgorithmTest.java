package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class OriginalAlgorithmTest {
  
  @Test
  public void shouldReturnTheContentOfTheOriginalLine() {
    Line line = new Line(0, "adasd;asdasd;34;67fg");
    String expected = "adasd;asdasd;34;67fg";
    assertEquals(expected, new OriginalAlgorithm().execute(line));
  }

}
