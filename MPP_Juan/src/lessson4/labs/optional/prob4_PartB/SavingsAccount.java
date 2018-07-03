package lessson4.labs.optional.prob4_PartB;

public class SavingsAccount extends Account {

	private double balace;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double balace) {
		// TODO Auto-generated constructor stub
		this.acctId=acctId;
		this.interestRate=interestRate;
		this.balace=balace;
	}

	@Override
	String getAccountId() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return this.balace;
	}

	@Override
	double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return this.balace+ (this.balace*this.interestRate);
	}

}
