package ar.edu.unpaz.maxicorrea.tp0.util;

public class UtilString {

  private UtilString() {
    throw new AssertionError("Utility class");
  }

  public static String removeExtension(String filename) {
    int pointIndex = filename.lastIndexOf('.');
    filename = filename.substring(0, pointIndex);
    return filename;
  }
  
}
