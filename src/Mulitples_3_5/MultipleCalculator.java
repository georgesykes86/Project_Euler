package Mulitples_3_5;

import java.util.stream.IntStream;

public class MultipleCalculator {

    private boolean isMultipleOfThree(int num) {
        return num % 3 == 0;
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }

    private int sumIfMultipleOfThreeOrFive(int accumulator, int testInt) {
        if (isMultipleOfThree(testInt) || isMultipleOfFive(testInt)) {
            return accumulator + testInt;
        } else {
            return accumulator;
        }
    }

    public int sumMultiplesOfThreeAndFiveBelow(int num) {
        return IntStream.range(0, num)
                .reduce(0, this::sumIfMultipleOfThreeOrFive);
    }
}
