package ar.edu.unpaz.maxicorrea.tp0;

import java.io.IOException;
import ar.edu.unpaz.maxicorrea.tp0.algorithms.AlgorithmFactory;
import ar.edu.unpaz.maxicorrea.tp0.model.Analyzer;
import ar.edu.unpaz.maxicorrea.tp0.model.Reader;

public class Main {

  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.err.println("you must indicate the command : java Main <file path>");
      return;
    }
    Reader reader = new Reader(args[0]);
    AlgorithmFactory factory = new AlgorithmFactory();
    Analyzer analizer = new Analyzer(reader, factory.getAllAlgorithms());
    analizer.analyze();
  }

}
