package lesson4.lab4.additional;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double total=0;
		for(Employee em: list){
			total+=em.computeUpdatedBalanceSum();
		}
		return total;
	}
}
