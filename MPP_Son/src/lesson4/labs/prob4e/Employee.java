package lesson4.labs.prob4e;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private List<Account> accts;
	
	public Employee(String name)
	{
		this.name = name;
		this.accts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acc)
	{
		this.accts.add(acc);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double sum = 0.0;
		for(Account a: accts)
			sum += a.computeUpdatedBalance();
		return sum;
	}
}
