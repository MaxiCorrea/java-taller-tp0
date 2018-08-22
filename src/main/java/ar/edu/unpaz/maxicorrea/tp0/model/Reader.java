package ar.edu.unpaz.maxicorrea.tp0.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

  private String path;
  private BufferedReader reader;
  
  public Reader(String path) throws FileNotFoundException {
    this.path = path;
    reader = new BufferedReader(new FileReader(path));
  }

  List<Line> getAllLines() throws IOException {
    String strLine;
    int number = 1;
    List<Line> lines = new ArrayList<>();
    while ((strLine = reader.readLine()) != null) {
      lines.add(new Line(number++, strLine));
    }
    return lines;
  }

  String getPath() {
    return path;
  }

  void close() throws IOException {
    reader.close();
  }

}
