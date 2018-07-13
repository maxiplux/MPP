package lesson9_part2.labs.prob9;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
	
	public static void printSquares(int num)
	{
		
	 IntStream.iterate(1, i -> i+1  ).limit(num).forEach(x ->  System.out.println(x*x) );
	 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printSquares(4);

	}

}
