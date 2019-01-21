package SumSquareDifference;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumSquareTest {

  private SumSquareCalculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new SumSquareCalculator();
  }

  @Test
  public void testUpToTen() {
    assertEquals(2640, calculator.differenceInSumOfSquaresUpTo(10));
  }

  @Test
  public void testUpToOneHundred() {
    assertEquals(1, calculator.differenceInSumOfSquaresUpTo(100));
  }

}
