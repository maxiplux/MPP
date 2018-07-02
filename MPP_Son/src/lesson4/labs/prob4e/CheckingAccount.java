package lesson4.labs.prob4e;

public class CheckingAccount extends Account{
	
	private double balance;
	private String acctId;
	private double monthlyFee;
	
	public CheckingAccount(String acctId, double monthlyFee, double balance) {
		this.acctId = acctId;
		this.balance = balance;
		this.monthlyFee = monthlyFee;
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
		double result = balance - monthlyFee;
		this.balance = result;
		return result;
	}

}
