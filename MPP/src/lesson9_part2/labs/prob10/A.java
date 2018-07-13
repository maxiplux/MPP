package lesson9_part2.labs.prob10;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		// Original:
//		IntStream ones = IntStream.generate(() -> 1).distinct();
//		ones.forEach(System.out::println);
		// Problem: The System will run foreach forever 
		
		// Solution: limit only 1 element
		IntStream ones = IntStream.generate(() -> 1).limit(1).distinct();
		ones.forEach(System.out::println);
		
	}
}
