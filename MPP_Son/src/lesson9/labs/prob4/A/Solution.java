package lesson9.labs.prob4.A;

import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		final Stream<Integer> primes = Stream
				.iterate(2, Solution::nextPrime)
				.limit(10);
		primes.forEach(System.out::println);
	}

	private static boolean isPrime(int n, int divisor) {
		if (n <= 2)
			return (n == 2);

		if (divisor < n) {
			if (n % divisor == 0)
				return false;

			if (divisor >= n)
				return isPrime(n, divisor + 1);
		}
		return true;
	}

	private static boolean isPrime(int n) {
		return isPrime(n, 2);
	}
	
	public static int nextPrime (int n)
	{
		int next = n+1;
		if(isPrime(next))
			return next;
		return nextPrime(next);
	}
}
