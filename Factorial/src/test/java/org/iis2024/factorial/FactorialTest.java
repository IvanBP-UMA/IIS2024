package org.iis2024.factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 Factorial:
 0 - 1
 1 - 1
 2 - 2
 3 - 6
 4 - 24
 7 - 5040
 -1 - raise an exception
 */
class FactorialTest {

  private Factorial factorial;

  @BeforeEach
  void setUp() {
    factorial = new Factorial();
  }

  @Test
  void givenInt0ThenFactorialReturn1() {
    long obtainedValue = factorial.compute(0);
    long expectedValue = 1;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenInt1ThenFactorialReturn1() {
    long obtainedValue = factorial.compute(1);
    long expectedValue = 1;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenInt2ThenFactorialReturn2() {
    // Act
    long obtainedValue = factorial.compute(2);
    long expectedValue = 2;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenInt3ThenFactorialReturn6() {
    // Act
    long obtainedValue = factorial.compute(3);
    long expectedValue = 6;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenInt4ThenFactorialReturn24() {

    // Act
    long obtainedValue = factorial.compute(4);
    long expectedValue = 24;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenInt7ThenFactorialReturn5040() {
    // Act
    long obtainedValue = factorial.compute(7);
    long expectedValue = 5040;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void givenNegativeNumberThenThrowFactorialException() {
    assertThrows(RuntimeException.class, () -> factorial.compute(-4));
  }

  @Test
  void givenBigNumberThenThrowFactorialException(){
    assertThrows(FactorialException.class,
            () -> factorial.compute(30)
    );
  }
}