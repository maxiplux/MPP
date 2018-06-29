package lesson4.lab4.additional;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private List<Account> accts= new ArrayList<Account>();
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public void addAccount(Account ac){
		this.accts.add(ac);
	}


	public String getName() {
		return name;
	}





	public double computeUpdatedBalanceSum() {
		//implement
		double total=0;
		for(Account ac: accts){
			ac.computUpdatedBalance();
			total+=ac.getBalance();
		}
		return total;
	}
}
