package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class ReverseOrderAlgorithm implements Algorithm {
  
  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    sort(line.getValidNumbers(), reverseOrder());
    for (Integer i : line.getValidNumbers()) {
      result.append(i).append(SEPARATOR);
    }
    return result.toString();
  }

}
