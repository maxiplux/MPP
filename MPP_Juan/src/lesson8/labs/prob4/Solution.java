package lesson8.labs.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;
import javax.sound.midi.Synthesizer;

public class Solution {

	public static int countWords(List<String> words, char c, char d, int len) {
		int result = 0;
		for (String string : words) {

			if (string.length() == len && string.toLowerCase().contains(string.valueOf(c).toLowerCase())
					&& !string.toLowerCase().contains(string.valueOf(d).toLowerCase())) {

				result++;

			}
		}
		return result;
	}

	public static int goodSolutionCountWords(List<String> words, char c, char d, int len) {
		return (int) words.stream() // convert list to stream
				.filter(string -> {

					return string.length() == len && string.toLowerCase().contains(string.valueOf(c).toLowerCase())
							&& !string.toLowerCase().contains(string.valueOf(d).toLowerCase());
				}).count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = new ArrayList<String>(
				Arrays.asList("Apple", "Banana", "Orange", "Asparagus", "Carrot", "Tomato"));
		System.out.println("Initial solution");
		System.out.println(countWords(words, 'T', 'k', 6));
		System.out.println(countWords(words, 'A', 'k', 5));

		System.out.println("Good  solution");
		System.out.println(goodSolutionCountWords(words, 'T', 'k', 6));
		System.out.println(goodSolutionCountWords(words, 'A', 'k', 5));

	}

}
