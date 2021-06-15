package com.redbee.academy.challenge;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    return List.of(Collections.max(val(a)), Collections.max(val(b)));
  }

  public static List<Integer> val(List<Integer> x) {
    return Objects.requireNonNullElse(x, List.of(0));
  }
}
