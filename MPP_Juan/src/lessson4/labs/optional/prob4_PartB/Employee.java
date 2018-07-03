package lessson4.labs.optional.prob4_PartB;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name=name;
		this.accounts=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public void addAccount(Account account) 
	{
		this.accounts.add(account);
	}
	
	public double computeUpdatedBalanceSum() 
	{
		double total = 0;
		for (Account account : accounts) {
			total=total+account.computeUpdatedBalance();
			
			
		}
		return total;
	}
}
