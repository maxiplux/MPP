package lesson4.lab4.prob4;

import java.time.LocalDate;

public abstract class    Employee {
	private int empId;
	
	
	public Employee(int empId) {
		
		this.empId = empId;
	}
	
	public void print() {
		LocalDate now = LocalDate.now();
		System.out.println(calcCompesation(now.getMonthValue(), now.getYear()));
	}
	public Paycheck calcCompesation(int month, int year) 
	{
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay);
	}
	
	
	abstract  double calcGrossPay(int mont,int year);
	
	
	
		
		

}
