# Prime Factors

## Problem statement
The original problem statement from Euler was to find the largest prime factor of a number however 
I modified this to finding the set of prime factors.

## Solution
In my solution the numbers up to the square root of the number are iterated through and there is a check
to see if they are a factor and it is a prime number. If so it is added to the list and the main number is divided
by that factor and the process is begun again in a recursive fasion until the max value is reached or the number remaining is a prime number.
There are two for loops used to iterate over the numbers which will be the factor and then again to check if that number is prime.
It would be preferable to not iterate twice.