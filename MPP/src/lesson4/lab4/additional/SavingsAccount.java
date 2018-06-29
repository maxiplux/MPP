package lesson4.lab4.additional;

public class SavingsAccount extends Account {
	private String acctId;
	private double interestRate;
	private double balance;
	
	
	
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		super();
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computUpdatedBalance() {
		// TODO Auto-generated method stub
		double rb=balance + (interestRate * balance);
		balance=rb;

		return rb;
	}

}
