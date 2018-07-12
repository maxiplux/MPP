package lesson9_part2.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

import lesson9_part2.labs.prob11a.Employee;

public class LambdaLibrary {
	public static final
		TriFunction<List<Employee> ,Integer, Character, List<String> >
		CUSTOM_EMPLOYEE_LIST
			= (list, salaryLimit, charBound) 
				-> list.stream()
					.filter(x -> x.getSalary() > salaryLimit)
					.filter(x -> x.getLastName().charAt(0) > charBound)
					.map(Employee::fullName)
					.sorted()
					.collect(Collectors.toList());
}
