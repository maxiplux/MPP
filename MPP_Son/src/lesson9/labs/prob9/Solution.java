package lesson9.labs.prob9;

import java.util.stream.Stream;

public class Solution {
	public static void printSquares(int num)
	{
		Stream
//				.rangeClosed(1, num)
				.iterate(1, x->x+1)
				.map(x->x*x)
				.limit(num)
				.forEach(x->System.out.println(x ))
				
				;
	}
	
	public static void main(String[] args) {
		printSquares(4);
	}
}
