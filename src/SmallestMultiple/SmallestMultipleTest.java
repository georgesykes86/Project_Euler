package SmallestMultiple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmallestMultipleTest {

  SmallestMultipleCalculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new SmallestMultipleCalculator();
  }

  @Test
  public void upToTenTest() {
    assertEquals(2520, calculator.findSmallestMultipleForNumbersUpTo(10));
  }

  @Test
  public void upToTwentyTest() {
    assertEquals(232792560, calculator.findSmallestMultipleForNumbersUpTo(20));
  }


}
