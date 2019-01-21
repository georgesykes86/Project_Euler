package NextPrime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NextPrimeTest {

  private NextPrime nextPrimeFinder;

  @BeforeEach
  public void setUp() {
    nextPrimeFinder = new NextPrime();
  }

  @Test
  public void sixthPrimeTest() {
    assertEquals(13, nextPrimeFinder.findPrimeNumber(6));
  }

  @Test
  public void bigPrimeTest() {
    assertEquals(104743, nextPrimeFinder.findPrimeNumber(10001));
  }

}
