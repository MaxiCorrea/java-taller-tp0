package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static java.lang.String.valueOf;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class AverageAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    double sum = 0;
    int size = line.getValidNumbers().size();
    for (int x : line.getValidNumbers()) {
      sum += x;
    }
    return valueOf((size == 0) ? 0 : sum / size);
  }

}
