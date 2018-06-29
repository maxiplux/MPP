package lesson4.lab4.prob4;

import java.util.ArrayList;
import java.util.List;

import lesson3.labs.prob3.B.Circle;
import lesson3.labs.prob3.B.Cylinder;

public class TestClass {
	
	public static void main(String[] args) {
	 List<Employee> database = new ArrayList<Employee>();
	 Hourly  renuka= new Hourly(20181, 120, 40);
	 Salaried  winston= new Salaried(20182, 15000);
	 database.add(renuka);
	 database.add(winston);
	 Commissionade Elonmusk= new Commissionade(201712, 0.10, 500000);
	 
	 new Order(2211, 1000000,Elonmusk);
	 new Order(2211, 1000000 ,Elonmusk);
	 new Order(2211, 1000000 ,Elonmusk);
	 

	 
	 
	 
	 Commissionade steve= new Commissionade(2017121, 0.20, 500000);
	 
	 new Order(2211, 1000000,steve);
	 new Order(2211, 1000000 ,steve);
	 new Order(2211, 1000000 ,steve);
	 
 
	 database.add(Elonmusk);
	 database.add(steve);
	 
	 
	 for (Employee employee : database) {
		 employee.print();
		
	}
	 
	 
	 
	 
	}
	

}
