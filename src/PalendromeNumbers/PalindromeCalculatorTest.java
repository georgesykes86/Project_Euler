package PalendromeNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCalculatorTest {

    private PalindromeCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new PalindromeCalculator();
    }

    @Test
    public void twoDigitNumberCombinationTest() {
        assertEquals("9009", calculator.findLongestPalindromeForNumbersWithDigits(2));
    }

    @Test
    public void threeDigitNumberCombinationTest() {
        assertEquals("906609", calculator.findLongestPalindromeForNumbersWithDigits(3));
    }
}
