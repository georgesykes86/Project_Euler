# Sum of Even Fibonacci numbers

## Problem statement
The fibonacci sequence is a famous mathematical sequence where the next number is equal to the sum of the previous two  numbers as shown below.
0, 1, 1, 2, 3, 5, 8, 13, 21, .....
This problem aims to calculate the sum of all the even values in the Fibonacci sequence up to and including a maximum value of 4,000,000.

## Solution
Two solutions have been explored.

The first iterates over the fibonacci sequence calculating the new figure each time and checks to see if it is greater than the
max value or is odd. If the first is true the iteration stops and the sum is returned. If the number is even then it is added to
the sum and the next value is calculated.

The second solution makes use of the fact that the third value in the sequence is always even so effectively every third number can
be added to the sum. Again a while loop is used to check that the max value has not been breached but now a the sequence is broken up
into chunks of three numbers with the third being added to the sum and then the next tree numbers being calculated.