package Mulitples_3_5;

import java.util.stream.IntStream;

public class MultipleCalculator {

    private boolean isMultipleOfThree(int num) {
        return num % 3 == 0;
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }

    private int sumIfMultipleOfThreeOrFive(int total, int testInt) {
        if (isMultipleOfThree(testInt) || isMultipleOfFive(testInt)) {
            return total + testInt;
        } else {
            return total;
        }
    }

    private double sumOfMultiplesOfThree(int num) {
        double n = Math.floor((num - 1) / 3);
        return (1.5 * n * (n + 1));

    }

    private double sumOfMultiplesOfFive(int num) {
        double n = Math.floor((num -1) / 5);
        return (2.5 * n * (n + 1));
    }

    private double sumOfDuplicates(int num) {
        double n = Math.floor((num -1) / 15);
        return (7.5 * n * (n + 1));
    }

    public int sumMultiplesOfThreeAndFiveBelow(int num) {
        return IntStream.range(0, num)
                .reduce(0, this::sumIfMultipleOfThreeOrFive);
    }

    public int sumUsingStandardDataTypes(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (isMultipleOfFive(i) || isMultipleOfThree(i)) { sum += i; }
        }
        return sum;
    }

    public double sumUsingFormula(int num) {
        return sumOfMultiplesOfThree(num) + sumOfMultiplesOfFive(num) - sumOfDuplicates(num);
    }

}
