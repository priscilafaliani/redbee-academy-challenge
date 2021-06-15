package com.redbee.academy.challenge;

import java.util.Objects;

public class CompareNumbers {

  /**
   * Method that receives three numbers and returns the
   * max.
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    return Integer.max(val(a), Integer.max(val(b), val(c)));
  }

  public static Integer val(Integer x) {
    return Objects.requireNonNullElse(x, 0);
  }
}
