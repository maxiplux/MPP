package lesson9_part2.labs.prob11b;

import java.util.Arrays;
import java.util.List;

import lesson9_part2.labs.prob11a.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		List<String> resultList =LambdaLibrary.CUSTOM_EMPLOYEE_LIST.apply(list,100_000, 'M'); 
		System.out.println(resultList);
	}

}
