package lesson8.labs.prob2.parA;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary == e2.salary) {
			return 0;
		}
		
		if(e1.salary < e2.salary) 
		{
			return -1;
		}
		
		return 1;
	}
}
