package com.redbee.academy.challenge;

import java.util.Objects;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    return val(a) + val(b);
  }

  public static Integer val(Integer x) {
    return Objects.requireNonNullElse(x, 0);
  }
}
