package lesson9_part2.labs.prob10;

import java.util.Optional;
import java.util.stream.Stream;

public class B {
	public static void main(String[] args) {
			Stream<String> stream = Stream.of("Bill", "Thomas", "Mary");
			System.out.println(stream.reduce((x,y) -> x + "," + y).orElse(""));
	}
}
