package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class OriginalAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    return line.getData();
  }

}
