package EvenFibonnaci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenFibonnaciTest {

    EvenFibonacciCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new EvenFibonacciCalculator();
    }

    @Test
    public void maxTenTest() {
        assertEquals(10, calculator.sumOfEvenFibonacciUpTo(10));
    }

    @Test
    public void maxOneHundredTest() {
        assertEquals(44, calculator.sumOfEvenFibonacciUpTo(100));
    }

    @Test
    public void maxTwentyThousandTest() {
        assertEquals(14328, calculator.sumOfEvenFibonacciUpTo(20000));
    }

    @Test
    public void maxFourMillionTest() {
        assertEquals(4613732, calculator.sumOfEvenFibonacciUpTo(4000000));
    }

    @Test
    public void maxFourMillionWithoutEvenCheckTest() {
        assertEquals(4613732, calculator.sumOfEvenFibonacciWithoutEvenCheck(4000000));
    }

}
