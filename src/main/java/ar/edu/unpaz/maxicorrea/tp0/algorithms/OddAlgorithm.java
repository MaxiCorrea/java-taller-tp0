package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class OddAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    for (int x : line.getValidNumbers()) {
      if (isOdd(x)) {
        result.append(x).append(SEPARATOR);
      }
    }
    return result.toString();
  }

  private boolean isOdd(int number) {
    return number % 2 != 0;
  }
}
