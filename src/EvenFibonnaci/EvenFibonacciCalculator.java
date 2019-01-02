package EvenFibonnaci;

public class EvenFibonacciCalculator {

    public long sumOfEvenFibonacciUpTo(long max) {
        long sum = 0;
        long previousNum = 0;
        long currentNum = 1;
        while (currentNum <= max) {
            if (isEven(currentNum)) {
                sum += currentNum;
            }
            long nextNum = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = nextNum;
        }
        return sum;
    }

    public long sumOfEvenFibonacciWithoutEvenCheck(long max) {
        long sum = 0;
        long firstNum = 1;
        long secondNum = 1;
        long thirdNum = 2;
        while (thirdNum <= max) {
            sum += thirdNum;
            firstNum = thirdNum + secondNum;
            secondNum = firstNum + thirdNum;
            thirdNum = firstNum + secondNum;
        }
        return sum;
    }

    private boolean isEven(long num) {
        return num % 2 == 0;
    }
}
