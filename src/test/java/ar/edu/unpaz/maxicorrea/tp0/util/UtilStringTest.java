package ar.edu.unpaz.maxicorrea.tp0.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilStringTest {

  @Test
  public void shouldDeleteTheFileExtension() {
    String actual = "myfile.txt";
    String expected = "myfile";
    assertEquals(expected, UtilString.removeExtension(actual));
  }

}
