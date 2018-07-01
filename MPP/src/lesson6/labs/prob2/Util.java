package lesson6.labs.prob2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {

	public static int countLetters(String args) {
		if (args==null)
		{
			return 0;
		}
		return args.length();

	}

	public static String reverseLetters(String args) {
		if (args==null)
		{
			return "";
		}
		 return Stream.of(args)
	                .map(word->new StringBuilder(word).reverse())
	                .collect(Collectors.joining(""));
		 
		 

	}

	public static String removeDuplicates(String args) {
		if (args==null)
		{
			return "";
		}
		StringBuilder builder = new StringBuilder();
		String[] container = args.split("");

		for (String string : container) {
			if (!builder.toString().contains(string)) {
				builder.append(string);
			}

		}
		return builder.toString();

	}

}
