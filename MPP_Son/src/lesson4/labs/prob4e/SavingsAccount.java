package lesson4.labs.prob4e;

public class SavingsAccount extends Account {

	private double interestRate;
	private double balance;
	private String acctId;

	public SavingsAccount(String acctId, double interestRate, double balance) {
		this.acctId = acctId;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	@Override
	String getAccountId() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		double result = balance + (interestRate * balance);
		this.balance = result;
		return result;
	}

}
