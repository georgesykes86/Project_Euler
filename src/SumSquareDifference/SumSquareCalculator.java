package SumSquareDifference;

public class SumSquareCalculator {

  public int differenceInSumOfSquaresUpTo(int i) {
    return squareOfSum(i) - sumOfSquares(i);
  }

  private int squareOfSum(int i) {
    int result = ((int) Math.pow(i, 4) + (int) (2 * Math.pow(i, 3)) + (int) Math.pow(i, 2))/4;
    System.out.println(result);
    return result;
  }

  private int sumOfSquares(int i) {
    int result  = (i * (i + 1) * ((2 * i) + 1))/6;
    System.out.println(result);
    return result;
  }
}
