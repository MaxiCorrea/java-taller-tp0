package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static java.lang.String.valueOf;
import static java.util.Collections.frequency;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class RepeatedAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    for (int x : line.getValidNumbers()) {
      if (frequency(line.getValidNumbers(), x) > 1) {
        if (!result.toString().contains(valueOf(x))) {
          result.append(x).append(SEPARATOR);
        }
      }
    }
    return result.toString();
  }

}
