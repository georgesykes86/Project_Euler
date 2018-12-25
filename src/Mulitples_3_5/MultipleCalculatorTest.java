package Mulitples_3_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MultipleCalculatorTest {

    MultipleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new MultipleCalculator();
    }


    @Test
    public void threeIsMultipleOfThreeTest() {
        assertTrue(calculator.isMultipleOfThree(3));
    }

    @Test
    public void sixIsMultipleOfThreeTest() {
        assertTrue(calculator.isMultipleOfThree(6));
    }

    @Test
    public void fiveIsNotMutplipleOfThree() {
        assertFalse(calculator.isMultipleOfThree(5));
    }

    @Test
    public void eightIsNotMultipleOfThree() {
        assertFalse(calculator.isMultipleOfThree(8));
    }

    @Test
    public void fiveIsMultipleOfFive() {
        assertTrue(calculator.isMultipleOfFive(5));
    }

    @Test
    public void sixIsNotMultipleOfFive() {
        assertFalse(calculator.isMultipleOfFive(6));
    }

    @Test
    public void tenIsMultipleOfFive() {
        assertTrue(calculator.isMultipleOfFive(10));
    }

}