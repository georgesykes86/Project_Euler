# Multiples of 3 and 5 sum calculator

## Problem statement
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

## Solution
The demonstrated solutions show three alternative options. The first uses an IntStream to run through the numbers and test whether 
they are multiples of three or five and a reduce function to combine only those that are multiples.
The second option performs a similar function but uses a standard for loop to iterate over the numbers up to the max and add the multiples
to an accumulated figure.
The third option uses a mathematical approach which utilises the sum of a series formula.
After timing all three it seems the first approach has an impact on performance which means it is slowest by a margin.
Thee second method seems to be fastest but not significantly.
