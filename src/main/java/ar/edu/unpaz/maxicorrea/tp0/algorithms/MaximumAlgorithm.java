package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static java.lang.String.valueOf;
import static java.util.Collections.max;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class MaximumAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    if (line.hasValidNumbers()) {
      return valueOf(max(line.getValidNumbers()));
    }
    return "";
  }

}
