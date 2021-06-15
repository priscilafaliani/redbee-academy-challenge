package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> res = new ArrayList<Integer>();

    for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
      res.add(Math.max(getOrDef(a, i), getOrDef(b, i)));
    }

    return res;
  }

  /**
   * 
   * @param x - An Integer List
   * @param index - An index to get a value from
   * @return The value in list[index] or 0 if index is out of bounds.
   */
  public static Integer getOrDef(List<Integer> x, int index) {
    return (index >= 0 && index < x.size()) ? x.get(index) : 0;
  }

}
