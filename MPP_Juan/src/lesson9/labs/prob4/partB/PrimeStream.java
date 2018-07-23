package lesson9.labs.prob4.partB;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

public class PrimeStream { 
	public void printFirstNPrimes(int i) {
		Function<Integer,Boolean> lambdaprime= (n) -> Stream
				.iterate(2, (x) -> x+1)
				.limit(n)
				.filter( (x) -> n%x == 0 && x!=n )
				.limit(1)
				.count() == 0 ||  !(n%2==0 && n!=2) ;
		
		Stream.iterate(2, x -> x + 1)
		.filter( lambdaprime::apply ).limit(i)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		 
		
	}

}
