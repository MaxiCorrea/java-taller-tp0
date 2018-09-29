package ar.edu.unpaz.maxicorrea.tp0.model;

import static ar.edu.unpaz.maxicorrea.tp0.util.UtilString.removeExtension;
import java.io.IOException;
import java.util.List;
import ar.edu.unpaz.maxicorrea.tp0.data.Reader;
import ar.edu.unpaz.maxicorrea.tp0.data.Writer;

public class Analyzer {

  private final Reader reader;
  private List<Algorithm> algorithms;

  public Analyzer(Reader reader, List<Algorithm> algorithms) {
    this.reader = reader;
    this.algorithms = algorithms;
  }

  public void analyze() throws IOException {
    for (Line line : reader.getAllLines()) {
      Writer writer = createWriterFor(line);
      for (Algorithm algo : algorithms) {
        writer.writeLine(algo.execute(line));
      }
      writer.close();
    }
    reader.close();
  }

  Writer createWriterFor(Line line) throws IOException {
    String pathResult = removeExtension(reader.getPath());
    pathResult += "_salida_<" + line.getNumber() + ">.txt";
    return new Writer(pathResult);
  }

}
