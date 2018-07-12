package lesson9_part2.labs.prob12;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, Long>
		QUERY_1 = (list, salaryBound, characterBound)
					-> list.stream()
							.filter(x -> x.getSalary() > salaryBound)
							.filter(x -> x.getLastName().charAt(0) > characterBound)
							.count();
					
	public static final TriFunction<List<Employee>, Integer, Character, List<String>>
		QUERY_2 = (list, salaryBound, characterBound)
					-> list.stream()
						.filter(x -> x.getSalary() > salaryBound)
						.filter(x -> x.getFirstName().charAt(0) < characterBound)
						.map(x -> (x.getFirstName() + " " + x.getLastName()).toUpperCase())
						.sorted()
						.collect(Collectors.toList());
}
