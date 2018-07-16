package lesson11.labs.prob5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

	public static <T extends Comparable<T>> T secondSmallest(List<T> list)

	{

		if (list.isEmpty()) {
			throw new IllegalArgumentException("Your list need to have at least 2 elements");
		}
		List<T> result = list.stream().sorted((T e1, T e2) -> e1.compareTo(e2)).collect(Collectors.toList());

		return result.get(1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> elements = Stream.iterate(1, (i) -> i + 1).limit(5).collect(Collectors.toList());
		String alphabet = "hijktlmnopqrauvwbcdefgsxyz";
		Stream.of(alphabet.split("")).collect(Collectors.toList());

		System.out.printf("You enter %s  and the second minimun element on it is %s \n", alphabet,
				secondSmallest(Stream.of(alphabet.split("")).collect(Collectors.toList())));
		System.out.printf("Your enter %s and the  second minimum elements to it is %s", elements,
				secondSmallest(elements));

	}

}
