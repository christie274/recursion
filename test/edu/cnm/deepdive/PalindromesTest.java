package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] knownPalindromes = {
      "radar",
      "abba",
      "x",
      ""
  };

  static final String[] knownNonPalindromes = {
      "sonar",
      "abb"
  };


  @Test
  void testRecursive() {
    assertTrue(Palindromes.testRecursive("radar"));
    assertFalse(Palindromes.testRecursive("sonar"));
    assertTrue(Palindromes.testRecursive("abba"));
    assertTrue(Palindromes.testRecursive("x"));
    assertFalse(Palindromes.testRecursive("abb"));
    assertTrue(Palindromes.testRecursive(""));
  }

@Test
  void testDenormalized() {
    assertTrue(Palindromes.testDenormalized("A man, a plan, a canal - Panama!"));
    assertFalse(Palindromes.testDenormalized("Aman, a plan, a dam - Hoover!"));
}
}

