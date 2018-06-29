package lesson4.lab4.prob4;

public class Salaried extends Employee {
	double salary;
	
	
	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	

	@Override
	double calcGrossPay(int mont, int year) {
	
		return this.salary;
	}

}
