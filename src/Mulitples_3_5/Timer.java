package Mulitples_3_5;

public class Timer {

    public static void timeCalculatorFunctions(int num) {
        MultipleCalculator calculator = new MultipleCalculator();
        long startTime = System.currentTimeMillis();
        System.out.println(calculator.sumMultiplesOfThreeAndFiveBelow(num));
        long firstTime = System.currentTimeMillis() - startTime;
        System.out.println(firstTime);
        long secondStartTime = System.currentTimeMillis();
        System.out.println(calculator.sumUsingStandardDataTypes(num));
        long secondTime = System.currentTimeMillis() - secondStartTime;
        long thirdStartTime = System.currentTimeMillis();
        System.out.println(calculator.sumUsingFormula(num));
        long thirdTime = System.currentTimeMillis() - thirdStartTime;
        System.out.println(String.format("%d, %d, %d", firstTime, secondTime, thirdTime));
    }

    public static void main(String args[]) {
        timeCalculatorFunctions(1000);
    }

}
