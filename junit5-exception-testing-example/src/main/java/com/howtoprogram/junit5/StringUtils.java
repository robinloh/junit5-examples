

package com.howtoprogram.junit5;

public final class StringUtils {

  public static Integer convertToInt(String str) {
    if (str == null || str.trim().length() == 0) {
      throw new IllegalArgumentException("String must be not null or empty");
    }
      System.out.println("Hellowowrdls");
    return Integer.valueOf(str);
  }
}

