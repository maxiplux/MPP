package lesson9.labs.prob4.partA;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Stream<BigInteger> primes = Stream.iterate(new BigInteger("2"), (x) -> x.nextProbablePrime()).limit(100);		
		primes.forEach(System.out::println);

	}

}
