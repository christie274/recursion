package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   * Compute the factorial of the parameter {@code n}, processing and returning the result as a {@Link BigInteger}, for extended szie value.
   * @param n the {@code long} value
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    BigInteger result = null;
   if (n < 0) {
     throw new IllegalArgumentException();
   }
   if (n > 0) {
     result = BigInteger.valueOf(n).multiply(computeRecursive(n -1));
   }
   return result;
  }


  public static BigInteger computeIterative(int n) throws IllegalArgumentException {
    BigInteger result = BigInteger.ONE;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
}
