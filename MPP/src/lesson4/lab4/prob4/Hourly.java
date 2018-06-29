package lesson4.lab4.prob4;

public class Hourly extends Employee {
	
	double hourlyWage;
	double hoursPerWeek;
 
	
	
	public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
 
	@Override
	double calcGrossPay(int mont, int year) { 
		return 4*this.hourlyWage*this.hoursPerWeek;
	}
	

}
