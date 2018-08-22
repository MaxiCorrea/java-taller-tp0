package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;

enum Algorithms {

  ORIGINAL(new OriginalAlgorithm()),

  VALID(new ValidAlgorithm()),

  INVALID(new InvalidAlgorithm()),

  MAXIMUN(new MaximumAlgorithm()),

  MINIMUN(new MinimumAlgorithm()),

  FACTORIAL(new FactorialAlgorithm()),

  NATURAL_ORDER(new NaturalOrderAlgorithm()),

  REVERSE_ORDER(new ReverseOrderAlgorithm()),

  REPEATED(new RepeatedAlgorithm()),

  ARITHMETIC_AVERAGE(new ArithmeticAverageAlgorithm()),

  MEDIAN(new MedianAlgorithm()),

  EVEN(new EvenAlgorithm()),

  ODD(new OddAlgorithm()),

  PRIME(new PrimeAlgorithm()),

  WITHOUT_REPEATED(new WithoutRepeatedAlgorithm());

  private Algorithm algo;

  private Algorithms(Algorithm algo) {
    this.algo = algo;
  }

  Algorithm getAlgorithm() {
    return algo;
  }

}
