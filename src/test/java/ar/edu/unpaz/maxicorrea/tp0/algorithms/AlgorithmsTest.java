package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ARITHMETIC_AVERAGE;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.EVEN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.FACTORIAL;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.INVALID;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MAXIMUN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MEDIAN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MINIMUN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.NATURAL_ORDER;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ODD;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ORIGINAL;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.PRIME;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.REPEATED;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.REVERSE_ORDER;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.VALID;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.WITHOUT_REPEATED;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AlgorithmsTest {

  @Test
  public void testingCorrespondenceBetweenEnumerationsAndAlgorithms() {
    assertTrue(ORIGINAL.getAlgorithm() instanceof OriginalAlgorithm);
    assertTrue(VALID.getAlgorithm() instanceof ValidAlgorithm);
    assertTrue(INVALID.getAlgorithm() instanceof InvalidAlgorithm);
    assertTrue(MAXIMUN.getAlgorithm() instanceof MaximumAlgorithm);
    assertTrue(MINIMUN.getAlgorithm() instanceof MinimumAlgorithm);
    assertTrue(FACTORIAL.getAlgorithm() instanceof FactorialAlgorithm);
    assertTrue(NATURAL_ORDER.getAlgorithm() instanceof NaturalOrderAlgorithm);
    assertTrue(REVERSE_ORDER.getAlgorithm() instanceof ReverseOrderAlgorithm);
    assertTrue(REPEATED.getAlgorithm() instanceof RepeatedAlgorithm);
    assertTrue(ARITHMETIC_AVERAGE.getAlgorithm() instanceof ArithmeticAverageAlgorithm);
    assertTrue(MEDIAN.getAlgorithm() instanceof MedianAlgorithm);
    assertTrue(EVEN.getAlgorithm() instanceof EvenAlgorithm);
    assertTrue(ODD.getAlgorithm() instanceof OddAlgorithm);
    assertTrue(PRIME.getAlgorithm() instanceof PrimeAlgorithm);
    assertTrue(WITHOUT_REPEATED.getAlgorithm() instanceof WithoutRepeatedAlgorithm);
  }

}
