package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static java.lang.String.format;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
import static java.util.Collections.max;
import java.math.BigInteger;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;
import ar.edu.unpaz.maxicorrea.tp0.model.Line;

class FactorialAlgorithm implements Algorithm {

  @Override
  public String execute(Line line) {
    if (line.hasValidNumbers()) {
      int maxValue = max(line.getValidNumbers());
      if (maxValue > 0) {
        return format("%d", factorial(maxValue));
      }
    }
    return "";
  }

  private static BigInteger factorial(int num) {
    BigInteger fact = ONE;
    for (int i = 1; i <= num; i++) {
      fact = fact.multiply(valueOf(i));
    }
    return fact;
  }

}
