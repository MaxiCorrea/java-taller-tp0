package ar.edu.unpaz.maxicorrea.tp0.model;

import static java.lang.Integer.valueOf;
import java.util.ArrayList;
import java.util.List;

public class Line {

  private static final String SEPARATOR_REGEX = "[;]";
  private static final String INTEGER_REGEX = "^(?:\\+|-)?\\d+$";

  private final int number;
  private final String data;
  private List<Integer> numbers;
  private List<String> invalids;

  public Line(int number, String data) {
    this.number = number;
    this.data = data;
    loadValidNumbers();
    loadInvalidNumbers();
  }

  private void loadValidNumbers() {
    numbers = new ArrayList<>();
    for (String token : data.split(SEPARATOR_REGEX)) {
      if (token.trim().matches(INTEGER_REGEX)) {
        numbers.add(valueOf(token));
      }
    }
  }

  private void loadInvalidNumbers() {
    invalids = new ArrayList<>();
    for (String token : data.split(SEPARATOR_REGEX)) {
      if (!token.trim().matches(INTEGER_REGEX)) {
        invalids.add(token);
      }
    }
  }

  public int getNumber() {
    return number;
  }

  public String getData() {
    return data;
  }

  public boolean hasValidNumbers() {
    return !numbers.isEmpty();
  }

  public List<Integer> getValidNumbers() {
    return numbers;
  }

  public List<String> getInvalids() {
    return invalids;
  }

}
