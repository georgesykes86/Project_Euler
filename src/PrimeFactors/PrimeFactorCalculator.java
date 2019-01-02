package PrimeFactors;

import java.util.ArrayList;

public class PrimeFactorCalculator {

    public ArrayList<Long> primeFactorsOf(long num) {
        ArrayList<Long> primeFactors = new ArrayList<Long>();
        while ((num > 1)) {
            if ((primeFactors.size() > 0) && (isPrime(num))) {
                primeFactors.add(num);
                return primeFactors;
            }
            Long factor = getLowestPrimeFactor(num);
            if (factor != null) {
                primeFactors.add((long) factor);
                num = num / (long) factor;
            }
        }
        return primeFactors;
    }

    private Long getLowestPrimeFactor(long num) {
        for (long i = 2; i <= (long) Math.floor(Math.sqrt(num)); i++) {
            if ((num % i == 0) && (isPrime(i))) {
                return i;
            }
        }
        return null;
    }

    private boolean isPrime(long num) {
        for (long i = 2; i < (long) Math.floor(Math.sqrt(num)); i++) {
            if ((num % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
