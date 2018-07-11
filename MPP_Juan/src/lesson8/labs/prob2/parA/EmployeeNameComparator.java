package lesson8.labs.prob2.parA;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int basename=e1.name.compareTo(e2.name) ;
		if (basename==0)
		{
			return e1.salary== e2.salary  ? 0 :  e1.salary < e2.salary ? -1 : 1;
		}		
		
		return basename ;
	}
}
