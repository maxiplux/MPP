package lesson8.labs.prob2.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	
	//Comparators are unaware of the value in method
	public void sort(List<Employee> emps) {
			Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		Employee joe = new Employee("Joe", 100000);
		Employee joe2 = new Employee("Joe", 200000);
		Employee joe3 = new Employee("Joe", 100000);
		
		System.out.println("joe equals joe2? " + joe.equals(joe2));
		EmployeeComparator c = new EmployeeComparator();
		System.out.println("joe equals joe2? " + (c.compare(joe, joe2)==0) );
		
		System.out.println("joe equals joe3? " + joe.equals(joe3));
		EmployeeComparator c2 = new EmployeeComparator();
		System.out.println("joe equals joe3? " + (c2.compare(joe, joe3)==0) );

	}
}


	
