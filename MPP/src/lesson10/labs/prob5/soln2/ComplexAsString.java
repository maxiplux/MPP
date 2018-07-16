package lesson10.labs.prob5.soln2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson10.labs.prob5.Employee;

public class ComplexAsString {
	public static String asString(List<Employee> list)
	{
		Stream<Employee> emps = list.stream();
		String result = 
				emps
				    .filter(LibraryCompanion::salaryGreaterThan100000)
				    .filter(LibraryCompanion::lastNameAfterM)
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.joining(", "));
		return result;
	}
	
	public static void printEmps(List<Employee> list) 
	{
		System.out.println(asString(list));
	}
	
	static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
}
