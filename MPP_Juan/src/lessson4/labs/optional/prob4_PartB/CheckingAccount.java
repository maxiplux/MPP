package lessson4.labs.optional.prob4_PartB;

public class CheckingAccount extends Account {
	
	private double balance;
	private double monthlyFee;
	private String acctId;
	public CheckingAccount(String acctId, double monthlyFee, int balance) {
		this.acctId=acctId;
		this.monthlyFee=monthlyFee;
		this.balance=balance;
		// TODO Auto-generated constructor stub
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
		 
		return balance - monthlyFee;
	}

}
