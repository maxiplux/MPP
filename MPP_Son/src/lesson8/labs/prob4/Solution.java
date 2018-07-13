package lesson8.labs.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Anh", "Yeu", "Em" , "Nhieu" , "LAM", "NHA");
		Solution sol = new Solution();
		
		System.out.println(sol.countWords(words, 'A', 'H', 3));
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
						.filter(x -> x.length() == len)
						.filter(x -> x.contains(String.valueOf(c)))
						.filter(x -> !x.contains(String.valueOf(d)))
						.count();
	}
}
