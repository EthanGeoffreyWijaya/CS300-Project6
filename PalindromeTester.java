//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: PalindromeTester
// Course: CS 300 Spring 2021
//
// Author: Ethan Geoffrey Wijaya
// Email: egwijaya@wisc.edu
// Lecturer: Mouna Kacem
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons: none
// Online Sources: none
//
///////////////////////////////////////////////////////////////////////////////
public class PalindromeTester {

  /**
   * Tester for mirrorA() without step implemented
   * 
   * @return true if all tests pass
   */
  public static boolean testMirrorA() {
    boolean error = false;
    // 1) Lower-case char input
    try {
      Palindrome.mirrorA('c');
      System.out
          .println("testMirrorA(): Error 1.1| Exception not thrown with lowercase char input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println(
          "testMirrorA(): Error 1.2| Wrong exception thrown. Exception details: " + e.getMessage());
      error = true;
    }

    // 2) Non-letter input
    try {
      Palindrome.mirrorA('1');
      System.out.println("testMirrorA(): Error 2.1| Exception not thrown for illegal type input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println(
          "testMirrorA(): Error 2.2| Wrong exception thrown. Exception details: " + e.getMessage());
      error = true;
    }

    // 3) Output test 1
    if (!Palindrome.mirrorA('D').equals("D C B A B C D")) {
      System.out
          .println("testMirrorA(): Error 3| Incorrect output. Expected: D C B A B C D. Actual: "
              + Palindrome.mirrorA('D'));
      error = true;
    }

    // 4) Output test 2
    if (!Palindrome.mirrorA('G').equals("G F E D C B A B C D E F G")) {
      System.out
          .println("testMirrorA(): Error 4| Incorrect output. Expected: G F E D C B A B C D E F G. "
              + "Actual: " + Palindrome.mirrorA('G'));
      error = true;
    }

    // 5) Output test 3
    if (!Palindrome.mirrorA('A').equals("A")) {
      System.out.println("testMirrorA(): Error 5| Incorrect output. Expected: A. Actual: "
          + Palindrome.mirrorA('A'));
      error = true;
    }

    if (error) {
      return false;
    }
    return true;
  }

  /**
   * Tester for mirrorA() with step value implemented
   * 
   * @return true if all tests pass
   */
  public static boolean testMirrorAStep() {
    boolean error = false;
    // 1) Lower-case char input
    try {
      Palindrome.mirrorA('d', 4);
      System.out
          .println("testMirrorAStep(): Error 1.1| Exception not thrown with lowercase char input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorAStep(): Error 1.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 2) Non-letter input
    try {
      Palindrome.mirrorA('1', 1);
      System.out
          .println("testMirrorAStep(): Error 2.1| Exception not thrown for illegal type input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorAStep(): Error 2.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 3) Bad step input 1
    try {
      Palindrome.mirrorA('B', 0);
      System.out.println("testMirrorAStep(): Error 3.1| No exception thrown for 0 step input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorAStep(): Error 3.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 4) Bad step input 2
    try {
      Palindrome.mirrorA('B', -8);
      System.out
          .println("testMirrorAStep(): Error 4.1| No exception thrown for negative step input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorAStep(): Error 4.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 5) Output test 1
    if (!Palindrome.mirrorA('E', 2).equals("E C A C E")) {
      System.out
          .println("testMirrorAStep(): Error 5| Incorrect output. Expected: E C A C E. Actual: "
              + Palindrome.mirrorA('E', 2));
      error = true;
    }

    // 6) Output test 2
    if (!Palindrome.mirrorA('E', 3).equals("E B B E")) {
      System.out.println("testMirrorAStep(): Error 6| Incorrect output. Expected: E B B E. "
          + "Actual: " + Palindrome.mirrorA('E', 3));
      error = true;
    }

    // 7) Output test 3
    if (!Palindrome.mirrorA('F', 1).equals("F E D C B A B C D E F")) {
      System.out.println(
          "testMirrorAStep(): Error 7| Incorrect output. Expected: F E D C B A B C D E F. Actual: "
              + Palindrome.mirrorA('F', 1));
      error = true;
    }

    if (error) {
      return false;
    }
    return true;
  }

  /**
   * Tester for mirrorZ() without step implemented
   * 
   * @return true if all tests pass
   */
  public static boolean testMirrorZ() {
    boolean error = false;
    // 1) Lower-case char input
    try {
      Palindrome.mirrorZ('c');
      System.out
          .println("testMirrorZ(): Error 1.1| Exception not thrown with lowercase char input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println(
          "testMirrorZ(): Error 1.2| Wrong exception thrown. Exception details: " + e.getMessage());
      error = true;
    }

    // 2) Non-letter input
    try {
      Palindrome.mirrorZ('1');
      System.out.println("testMirrorZ(): Error 2.1| Exception not thrown for illegal type input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println(
          "testMirrorZ(): Error 2.2| Wrong exception thrown. Exception details: " + e.getMessage());
      error = true;
    }

    // 3) Output test 1
    if (!Palindrome.mirrorZ('V').equals("V W X Y Z Y X W V")) {
      System.out
          .println("testMirrorZ(): Error 3| Incorrect output. Expected: V W X Y Z Y X W V. Actual: "
              + Palindrome.mirrorZ('V'));
      error = true;
    }

    // 4) Output test 2
    if (!Palindrome.mirrorZ('P').equals("P Q R S T U V W X Y Z Y X W V U T S R Q P")) {
      System.out.println("testMirrorZ(): Error 4| Incorrect output. "
          + "Expected: P Q R S T U V W X Y Z Y X W V U T S R Q P." + " Actual: "
          + Palindrome.mirrorZ('P'));
      error = true;
    }

    // 5) Output test 3
    if (!Palindrome.mirrorZ('Z').equals("Z")) {
      System.out.println("testMirrorZ(): Error 5| Incorrect output. Expected: Z. Actual: "
          + Palindrome.mirrorZ('Z'));
      error = true;
    }

    if (error) {
      return false;
    }
    return true;
  }

  /**
   * Tester for mirrorZ() with step implemented
   * 
   * @return true if all tests pass
   */
  public static boolean testMirrorZStep() {
    boolean error = false;
    // 1) Lower-case char input
    try {
      Palindrome.mirrorZ('d', 4);
      System.out
          .println("testMirrorZStep(): Error 1.1| Exception not thrown with lowercase char input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorZStep(): Error 1.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 2) Non-letter input
    try {
      Palindrome.mirrorZ('1', 1);
      System.out
          .println("testMirrorZStep(): Error 2.1| Exception not thrown for illegal type input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorZStep(): Error 2.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 3) Bad step input 1
    try {
      Palindrome.mirrorZ('Y', 0);
      System.out.println("testMirrorZStep(): Error 3.1| No exception thrown for 0 step input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorZStep(): Error 3.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 4) Bad step input 2
    try {
      Palindrome.mirrorZ('Y', -8);
      System.out
          .println("testMirrorZStep(): Error 4.1| No exception thrown for negative step input");
      error = true;
    } catch (IllegalArgumentException e) {

    } catch (Exception e) {
      System.out.println("testMirrorZStep(): Error 4.2| Wrong exception thrown. Exception details: "
          + e.getMessage());
      error = true;
    }

    // 5) Output test 1
    if (!Palindrome.mirrorZ('V', 2).equals("V X Z X V")) {
      System.out
          .println("testMirrorZStep(): Error 5| Incorrect output. Expected: V X Z X V. Actual: "
              + Palindrome.mirrorZ('V', 2));
      error = true;
    }

    // 6) Output test 2
    if (!Palindrome.mirrorZ('V', 3).equals("V Y Y V")) {
      System.out.println("testMirrorZStep(): Error 6| Incorrect output. Expected: V Y Y V. "
          + "Actual: " + Palindrome.mirrorZ('V', 3));
      error = true;
    }

    // 7) Output test 3
    if (!Palindrome.mirrorZ('U', 1).equals("U V W X Y Z Y X W V U")) {
      System.out.println(
          "testMirrorZStep(): Error 7| Incorrect output. Expected: U V W X Y Z Y X W V U. Actual: "
              + Palindrome.mirrorZ('U', 1));
      error = true;
    }

    if (error) {
      return false;
    }
    return true;
  }

  /**
   * Runs every test in the PalindromeTester class.
   * 
   * @return True if all test methods pass (if all test methods return true)
   */
  public static boolean runAllTests() {
    if (testMirrorA() && testMirrorAStep() && testMirrorZ() && testMirrorZStep()) {
      return true;
    }
    return false;
  }

  /**
   * Main method used for calling runAllTests().
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("runAllTests(): " + runAllTests());
  }

}
