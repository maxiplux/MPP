package lesson11.labs.prob1;

public class Solution {
	public static void main(String[] args) {
		//A
//		List<Integer> ints = new ArrayList<>();
//		ints.add(1);
//		ints.add(2);
//		List<Number> nums = ints;
//		nums.add(3.14);
		// -> when assigning nums to ints, then add 3.14 to nums, this means that we are adding 3.14 to List
		// Integer ints, -> wrong
		
		
		//b
//		List<Integer> ints = ArrayList<>();
//		ints.add(1);
//		ints.add(2);
//		List<? extends Number> nums = ints;
//		nums.add(3.14);		
		// -> ? extends Number means that the type including Number and it's subclasses, but when using extends
		// we can only extract, not add new 
	}
}
