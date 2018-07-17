package lesson11.labs.prob5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
//	public static Object secondSmallest(List<?> list)
//	{
//		return secondSmallestHelper(list);
//	}
	
	public static <T> T secondSmallest(List<T> list)
	{
		List<T> list1 = list
					.stream()
					.sorted()
					.collect(Collectors.toList());
		return list1.get(1);
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
