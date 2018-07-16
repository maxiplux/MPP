package lesson10.labs.prob5.soln2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import lesson10.labs.prob5.Employee;

public class Test {

	@org.junit.Test
	public void testSalaryGreaterThan100000() {
		Employee joe = new Employee("Joe", "Davis", 120000);
		Employee john = new Employee("John", "Sims", 110000);
		Employee andrew = new Employee("Andrew", "Reardon", 80000);
		
		assertEquals(LibraryCompanion.salaryGreaterThan100000(joe), true);
		assertEquals(LibraryCompanion.salaryGreaterThan100000(john), true);
		assertEquals(LibraryCompanion.salaryGreaterThan100000(andrew), false);
		
	}
	
	@org.junit.Test
	public void testLastNameAfterM() {
		Employee joe = new Employee("Joe", "Davis", 120000);
		Employee john = new Employee("John", "Sims", 110000);
		Employee andrew = new Employee("Andrew", "Reardon", 80000);
		
		assertEquals(LibraryCompanion.lastNameAfterM(joe), false);
		assertEquals(LibraryCompanion.lastNameAfterM(john), true);
		assertEquals(LibraryCompanion.lastNameAfterM(andrew), true);
		
	}

	public static List<Employee> data(){
		return Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
	}
}
