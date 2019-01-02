package PrimeFactors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorCalculatorTest {

    private PrimeFactorCalculator calculator;
    private ArrayList<Long> primeFactors;

    @BeforeEach
    public void setUp() {
        calculator = new PrimeFactorCalculator();
        primeFactors = new ArrayList();
    }

    @Test
    public void findsPrimeFactorsOfSix() {
        primeFactors.add(2L);
        primeFactors.add(3L);
        assertEquals(primeFactors, calculator.primeFactorsOf(6L));
    }

    @Test
    public void findsPrimeFactorsOfFifteen() {
        primeFactors.add(3L);
        primeFactors.add(5L);
        assertEquals(primeFactors, calculator.primeFactorsOf(15L));
    }

    @Test
    public void findsPrimeFactorsOf13195() {
        primeFactors.add(5L);
        primeFactors.add(7L);
        primeFactors.add(13L);
        primeFactors.add(29L);
        assertEquals(primeFactors, calculator.primeFactorsOf(13195L));
    }

    @Test
    public void findsPrimeFactorsOf600851475143() {
        primeFactors.add(71L);
        primeFactors.add(839L);
        primeFactors.add(1471L);
        primeFactors.add(6857L);
        assertEquals(primeFactors, calculator.primeFactorsOf(600851475143L));
    }
}
