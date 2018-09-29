package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

  private final BufferedWriter buffer;

  public Writer(String path) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    buffer = new BufferedWriter(fileWriter);
  }

  public void writeLine(String result) throws IOException {
    buffer.write(result);
    buffer.newLine();
  }

  public void close() throws IOException {
    buffer.close();
  }

}
