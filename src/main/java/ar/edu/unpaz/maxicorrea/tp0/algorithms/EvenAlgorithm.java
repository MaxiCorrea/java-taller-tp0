package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class EvenAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder builder = new StringBuilder();
    for (int x : line.getValidNumbers()) {
      if (isEven(x)) {
        builder.append(x).append(SEPARATOR);
      }
    }
    return builder.toString();
  }

  private boolean isEven(int number) {
    return number % 2 == 0;
  }

}
