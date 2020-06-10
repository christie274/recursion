package edu.cnm.deepdive;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Palindromes {

  public static boolean testRecursive(String input) {
    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );

  }

  public static boolean testDenormalized(String[] input) {
    String normalized = replaceAll();
        Boolean b;
    if ((testRecursive(String)
    )) {
    }
    return testRecursive(normalized);
  }
}

