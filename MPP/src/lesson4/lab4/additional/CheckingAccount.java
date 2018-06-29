package lesson4.lab4.additional;

public class CheckingAccount extends Account {
	private String acctId;
	private double monthlyFee;
	private double balance;
	
	
	
	public CheckingAccount(String acctId, double monthlyFee, double startBalance) {
		super();
		this.acctId = acctId;
		this.monthlyFee = monthlyFee;
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
		return balance-=monthlyFee;
	}

}
