package lesson9_part2.labs.prob10;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C {
	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(1,4,6,3,2,6,73,2,4,66,7);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(x->x));
		System.out.println("Maximum "+summary.getMax());
		System.out.println("Minimum "+summary.getMin());
	}
}
