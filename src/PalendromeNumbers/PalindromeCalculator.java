package PalendromeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PalindromeCalculator {

    public String findLongestPalindromeForNumbersWithDigits(int digits) {
        double maxFactor = Math.pow(10, digits);
        double minFactor = Math.pow(10, digits - 1);
        int largestPalindrome = (int) minFactor + 1;
        for (int i = (int) maxFactor - 1 ; i >= (int) minFactor; i--) {
            if (i * i <= largestPalindrome) { break; }
            for (int j = i; j >= (int) minFactor; j--) {
                int largestMultiple = i * j;
                if (largestMultiple <= largestPalindrome) { break; }
                if (isPalindrome(largestMultiple)) { largestPalindrome = largestMultiple; }
            }

        }
        return Integer.toString(largestPalindrome);
    }

    private boolean isPalindrome(int num) {
        String numString = Integer.toString(num);
        String reverseNumString = new StringBuilder(numString).reverse().toString();
        return Objects.equals(numString, reverseNumString);
    }
}
