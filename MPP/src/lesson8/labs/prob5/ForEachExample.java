package lesson8.labs.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// a. Use a lambda expression instead of directly defining a Consumer
		list.forEach(t -> System.out.println(t.toUpperCase()));

		// b. Use a method reference in place of your lambda expression in (a)
		Consumer<String> cons = (st) -> System.out.println(st.toUpperCase());
		list.forEach(cons::accept);
		// list.forEach(System.out::print);

	}

	// implement a Consumer

}