package ar.edu.unpaz.maxicorrea.tp0.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

  private final BufferedWriter buffer;

  Writer(String path) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    buffer = new BufferedWriter(fileWriter);
  }

  void writeLine(String result) throws IOException {
    buffer.write(result);
    buffer.newLine();
  }

  void close() throws IOException {
    buffer.close();
  }

}
