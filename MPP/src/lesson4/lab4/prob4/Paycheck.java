package lesson4.lab4.prob4;

final public class Paycheck {
	private double socialSecurity;
	private double grossPay;
	private double mediacare;
	private double local;
	private double state;
	private double fica;

	public Paycheck(double grossPay, double socialSecurity, double mediacare, double local, double state, double fica) {

		this.grossPay = grossPay;
		this.socialSecurity = socialSecurity;
		this.mediacare = mediacare;
		this.local = local;
		this.state = state;
		this.fica = fica;
	}

	public Paycheck(double grossPay) {

		this.grossPay = grossPay;
		this.socialSecurity = 7.5 / 100.0;
		this.mediacare = 3.0 / 100.0;
		this.local = 1.0 / 100.0;
		this.state = 5.0 / 100.0;
		this.fica = 23.0 / 100.0;
	}
	

	public void print() {

		System.out.println(this.toString());
	}

	@Override
	public String toString() {

		return String.format(
				"Paycheck: Id %s\n " + "  Gross Pay: %s \n" + "  Fica: %s \n" + "  State: %s \n" + "  Local: %s \n"
						+ "  Medicare: %s \n" + "  Social Security: %s \n" + "  NET PAY: %s \n\n\n",
				this.hashCode(), this.grossPay, this.fica, this.state, this.local, this.mediacare, this.socialSecurity,
				this.getNetPay());

	}

	public double getNetPay() {
		return this.grossPay - (this.grossPay * fica - this.grossPay * local - this.grossPay * mediacare
				- this.grossPay * socialSecurity - this.grossPay * state);
	}

}
