# Smallest Multiple

## Problem statement
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

## Solution
In this solution an initial set of prime numbers up to the target number is created. Then the primefactorisation
is performed by iterating over the numbers up to the target and performing a prime factorisation and adding any 
factors that haven't been added by prior numbers. Finally this map of factors and their expoents is combined using
a process similar to a map reduce.