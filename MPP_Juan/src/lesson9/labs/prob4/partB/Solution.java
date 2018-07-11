package lesson9.labs.prob4.partB;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
			PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
			ps.printFirstNPrimes(10);
			System.out.println("====");
			ps.printFirstNPrimes(5);

	}

}
