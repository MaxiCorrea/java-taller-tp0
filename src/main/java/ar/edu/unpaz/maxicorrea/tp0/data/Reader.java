package ar.edu.unpaz.maxicorrea.tp0.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

public class Reader {

  private String path;
  private BufferedReader reader;
  
  public Reader(String path) throws FileNotFoundException {
    this.path = path;
    reader = new BufferedReader(new FileReader(path));
  }

  public List<Line> getAllLines() throws IOException {
    String strLine;
    int number = 1;
    List<Line> lines = new ArrayList<>();
    while ((strLine = reader.readLine()) != null) {
      lines.add(new Line(number++, strLine));
    }
    return lines;
  }

  public String getPath() {
    return path;
  }

  public void close() throws IOException {
    reader.close();
  }

}
