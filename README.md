# digitSumAlgorithm

Problem Definition :

You have a sequence of numbers -- 1 through x (where x > 1).

Two numbers are randomly chosen from the sequence (y & z).

The product of y and z should equal the sum of all numbers in the sequence (minus y and z).
If you know the value of x, could we create an algorithm that tells me all possible values of y and z?

Example :

x = 26

y = 15 or 21

z = 21 or 15

Proof :

The sum of x = x*(x+1)/2;

In this case, the sum of x = 351

351 - (15 + 21) = 315

315 = 15 * 21 315 - 21 * 15


NOTE: The programming solution is not difficult. The issue is ensuring that this will not result in 
memory leaks / memory overflows for very large numbers. This requires an optimal algorithm. 