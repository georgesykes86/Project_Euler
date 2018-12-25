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
    public void eightIsSumOfMultiplesOfThreeAndFiveBelowSix() {
        assertEquals(8, calculator.sumMultiplesOfThreeAndFiveBelow(6));
    }

    @Test
    public void twentyThreeIsSumOfMultiplesOfThreeAndFiveBelowTen() {
        assertEquals(23, calculator.sumMultiplesOfThreeAndFiveBelow(10));
    }

    @Test
    public void testForAllMultiplesOfThreeAndFiveBelowOneThousand() {
        assertEquals(233168, calculator.sumMultiplesOfThreeAndFiveBelow(1000));
    }

}