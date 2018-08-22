package ar.edu.unpaz.maxicorrea.tp0.algorithms;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unpaz.maxicorrea.tp0.model.Algorithm;

public class AlgorithmFactory {
  
  public List<Algorithm> getAllAlgorithms() {
    List<Algorithm> algorithms = new ArrayList<>();
    for (Algorithms algorithmEnum : Algorithms.values()) {
      algorithms.add(algorithmEnum.getAlgorithm());
    }
    return algorithms;
  }
  
}
