package lesson9.labs.prob4.B;

import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		Solution ps = new Solution(); // PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}

	private void printFirstNPrimes(int i) {
		Stream<Integer> primes = Stream
				.iterate(1, x->x+1)
				.filter(Solution::isPrime)
				.limit(i);
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
}
