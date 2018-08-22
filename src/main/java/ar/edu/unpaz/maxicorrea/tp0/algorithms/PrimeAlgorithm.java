package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class PrimeAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    StringBuilder result = new StringBuilder();
    for (int x : line.getValidNumbers()) {
      if (isPrime(x)) {
        result.append(x).append(SEPARATOR);
      }
    }
    return result.toString();
  }

  private boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i < number; ++i) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
