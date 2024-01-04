//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: Palindrome
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
public class Palindrome {

  /**
   * A recursive program which, given a letter from which to start, outputs letters in reverse
   * alphabetical order until the letter A is reached, then outputs them in alphabetical order until
   * the starting letter is reached.
   * 
   * @param start The starting letter to use
   * @return A string with the ordered letters
   * @throws IllegalArgumentException If the value of start is lowercase or not a letter
   */
  public static String mirrorA(char start) throws IllegalArgumentException {
    if (Character.isLowerCase(start) || !Character.isLetter(start)) {
      throw new IllegalArgumentException("Invalid start value: Only uppercase letters allowed");
    }

    if (start == 'A') {
      // base case
      return "A";
    } else {
      // Current letters always wrap around the next letter determined by recursive call
      return start + " " + mirrorA((char) (start - 1)) + " " + start;
    }

  }

  /**
   * Overloaded version of mirrorA(). Works the same but implements a step parameter which dictates
   * how many letters to jump from in the process of ordering them. For instance, a step value of 1
   * will run the program normally, a step value of 2 will jump 2 letters as it is ordered, always
   * skipping the next letter.
   * 
   * @param start The starting letter to use
   * @param step  How many letters to jump when ordering them
   * @return A string with the ordered letters
   * @throws IllegalArgumentException If the value of start is lowercase or not a letter, or if step
   *                                  is 0 or negative
   */
  public static String mirrorA(char start, int step) throws IllegalArgumentException {
    if (Character.isLowerCase(start) || !Character.isLetter(start)) {
      throw new IllegalArgumentException("Invalid start value: Only uppercase letters allowed");
    }
    if (step <= 0) {
      throw new IllegalArgumentException(
          "Invalid step size: Only positive and non-zero integers allowed");
    }

    if (start == 'A') {
      // base case
      return "A";
    } else if ((char) (start - step) < 'A') {
      // This new branch is necessary to avoid throwing an exception if the current letter is less
      // than A due to a large step size. Prematurely catches the base case so that there will be
      // no errors in its implementation.
      return start + " " + start;
    } else {
      // Instead of being decremented by 1, step is used as decrement
      return start + " " + mirrorA((char) (start - step), step) + " " + start;
    }
  }

  /**
   * Similar to mirrorA() but in reverse order. Given a starting letter, will order alphabetically
   * until Z is reached, then in reverse alphabetic order until the original starting letter is
   * reached.
   * 
   * @param start The starting letter to use
   * @return A string with the ordered letters
   * @throws IllegalArgumentException If the start value is lowercase or not a letter
   */
  public static String mirrorZ(char start) throws IllegalArgumentException {
    if (Character.isLowerCase(start) || !Character.isLetter(start)) {
      throw new IllegalArgumentException("Invalid start value: Only uppercase letters allowed");
    }

    if (start == 'Z') {
      // base case
      return "Z";
    } else {
      // Similar wrapping method as in mirrorA(), but increments instead of decrements 1
      return start + " " + mirrorZ((char) (start + 1)) + " " + start;
    }
  }

  /**
   * Overloaded version of mirrorZ() with a step parameter implemented. Just like with mirrorA(),
   * the step value dictates how many letters in the alphabet to jump when ordering the letters. A
   * step value of 1 will call mirrorZ() normally, a step value of 2 will jump 2 letters ahead, a
   * step value of 3 will jump 3 letters ahead, etc.
   * 
   * @param start The starting letter to use
   * @param step  How many letters to jump when ordering them
   * @return A string with the ordered letters
   * @throws IllegalArgumentException If the start value is lowercase or not a letter, or if step is
   *                                  0 or negative
   */
  public static String mirrorZ(char start, int step) throws IllegalArgumentException {
    if (Character.isLowerCase(start) || !Character.isLetter(start)) {
      throw new IllegalArgumentException("Invalid start value: Only uppercase letters allowed");
    }
    if (step <= 0) {
      throw new IllegalArgumentException(
          "Invalid step size: Only positive and non-zero integers allowed");
    }

    if (start == 'Z') {
      // base case
      return "Z";
    } else if ((char) (start + step) > 'Z') {
      // This extra branch is still necessary. Wherever step is implemented and runs the risk of
      // decrementing or incrementing the current letter to a non-letter value, the base case must
      // be caught prematurely to avoid throwing an exception in the middle of a working algorithm.
      return start + " " + start;
    } else {
      // Again, step is used as increment as opposed to 1
      return start + " " + mirrorZ((char) (start + step), step) + " " + start;
    }
  }

}
