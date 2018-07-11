package lesson8.labs.prob5.partB;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachExample {
	 //public static Consumer<String> Consumer = ForEachExample::toUpperCase;	
	 
	  
	 public static void consumer(String l)
	 {
		System.out.println(l.toString());
	 }
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");
		
		list.forEach(ForEachExample::consumer);

		

	}

	// implement a Consumer

}