package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class InvalidAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    for (String str : line.getInvalids()) {
      result.append(str).append(SEPARATOR);
    }
    return result.toString();
  }

}
