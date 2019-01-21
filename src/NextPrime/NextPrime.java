package NextPrime;

public class NextPrime {

  public int findPrimeNumber(int maxNum) {
    int counter = 0;
    int i = 2;
    while (counter <= maxNum) {
      if (isPrime(i)) { counter++; }
      if (counter == maxNum) { break; }
      i++;
    }
    return i;
  }

  private boolean isPrime(int num) {
    for (int i = 2; i <= (int) Math.floor(Math.sqrt(num)); i++) {
      if ((num % i == 0)) { return false; }
    }
    return true;
  }
}
