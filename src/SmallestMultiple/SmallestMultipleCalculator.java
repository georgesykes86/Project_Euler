package SmallestMultiple;

import java.util.ArrayList;
import java.util.HashMap;

public class SmallestMultipleCalculator {

  public int findSmallestMultipleForNumbersUpTo(int maxNum) {
    ArrayList<Integer> primeNumbers = getPrimeNumbersUpTo(maxNum);
    HashMap<Integer, Integer> factors = primeFactorisationForNumbersUpTo(maxNum, primeNumbers);
    return smallestFactorFromMap(factors);
  }

  private int smallestFactorFromMap(HashMap<Integer, Integer> factors) {
    int returnValue = 1;
    for(Integer factor: factors.keySet()) {
      returnValue = returnValue * (int) Math.pow(factor, factors.get(factor));
    }
    return returnValue;
  }

  private HashMap primeFactorisationForNumbersUpTo(int maxNum, ArrayList<Integer> primeFactors) {
    HashMap<Integer, Integer> factors = new HashMap<>();
    for (int i = 2; i <= maxNum; i++) {
      int multiple = i;
      for (int prime: primeFactors) {
        if (prime > multiple) { break; }
        int count = 1;
        while (multiple % prime == 0) {
          int exponent = factors.get(prime) != null ? factors.get(prime) : 0;
          if (count >= exponent) {
            factors.put(prime, count);
          }
          count = count + 1;
          multiple = multiple / prime;
        }
      }
    }
    return factors;
  }

  private ArrayList<Integer> getPrimeNumbersUpTo(int num) {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= num; i++) { if (isPrime(i)) { primes.add(i); } }
    return primes;
  }

  private boolean isPrime(int num) {
    for (int i = 2; i <= (int) Math.floor(Math.sqrt(num)); i++) {
      if ((num % i == 0)) { return false; }
    }
    return true;
  }

}
