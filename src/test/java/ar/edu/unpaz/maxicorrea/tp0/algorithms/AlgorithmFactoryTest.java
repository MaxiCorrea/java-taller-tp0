package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ARITHMETIC_AVERAGE;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.EVEN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.FACTORIAL;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.INVALID;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MAXIMUM;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MEDIAN;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.MINIMUM;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.NATURAL_ORDER;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ODD;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.ORIGINAL;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.PRIME;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.REPEATED;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.REVERSE_ORDER;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.VALID;
import static ar.edu.unpaz.maxicorrea.tp0.algorithms.Algorithms.WITHOUT_REPEATED;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;

public class AlgorithmFactoryTest {

  @Test
  public void shouldReturnAllTheAlgorithms() {
    List<Algorithm> expecteds =
        Arrays.asList(ORIGINAL.getAlgorithm(), VALID.getAlgorithm(), INVALID.getAlgorithm(),
            MAXIMUM.getAlgorithm(), MINIMUM.getAlgorithm(), FACTORIAL.getAlgorithm(),
            NATURAL_ORDER.getAlgorithm(), REVERSE_ORDER.getAlgorithm(), REPEATED.getAlgorithm(),
            ARITHMETIC_AVERAGE.getAlgorithm(), MEDIAN.getAlgorithm(), EVEN.getAlgorithm(),
            ODD.getAlgorithm(), PRIME.getAlgorithm(), WITHOUT_REPEATED.getAlgorithm());

    assertEquals(expecteds, new AlgorithmFactory().getAllAlgorithms());
  }

}
