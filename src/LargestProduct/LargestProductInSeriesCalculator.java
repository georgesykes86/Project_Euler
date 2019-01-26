package LargestProduct;

import java.util.Arrays;
import java.util.stream.Stream;

public class LargestProductInSeriesCalculator {



  public long largestProductForLength(int sequenceLength, String numberString) {
    Integer[] integers = stringToIntegerArray(numberString);
    long maxProduct = 0;
    for (int i = 0; i <= integers.length - sequenceLength; i++ ) {
      long nextProduct = productOf(Arrays.copyOfRange(integers, i, i + sequenceLength));
      if (nextProduct > maxProduct) {
        maxProduct = nextProduct;
      }
    }
    return maxProduct;
  }

  private Integer[] stringToIntegerArray(String numberString) {
    String[] numberArray = numberString.split("");
    return Stream.of(numberArray)
        .map(Integer::valueOf).toArray(Integer[]::new);
  }

  private long productOf(Integer[] integers) {
    long product = 1;
    for (int i = 0; i < integers.length; i++) {
      product = product * integers[i];
    }
    return product;
  }
}
