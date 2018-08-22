package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class WithoutRepeatedAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    for (int x : line.getValidNumbers()) {
      if (!repeated(result, x)) {
        result.append(x).append(SEPARATOR);
      }
    }
    return result.toString();
  }

  private boolean repeated(StringBuilder result, int x) {
    for (String str : result.toString().split(SEPARATOR)) {
      if (str.equals(String.valueOf(x))) {
        return true;
      }
    }
    return false;
  }

}
