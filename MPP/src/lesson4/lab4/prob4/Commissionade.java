package lesson4.lab4.prob4;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.spi.TransactionalWriter;

public class Commissionade extends Employee {

	private double commisions;
	private double baseSalary;
	private List<Order> orders;

	public Commissionade(int empId, double commisions, double baseSalary) {
		super(empId);
		if (! (commisions >= 0 && commisions <= 1.0)) {
			throw new IllegalArgumentException(
					String.format("The commisions may be bettween 0 and 1  , but you pass %s ", commisions));
		}
		this.commisions = commisions;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();

	}

	public boolean addOrder(Order order) {
		this.orders.add(order);
		return true;

	}

	@Override
	double calcGrossPay(int mont, int year) {
		double total = 0;
		for (Order order : orders) {
			if (order.getOrderDate().getYear() == year && order.getOrderDate().getMonthValue() == mont) {
				total = total + order.getOrderAmount();
			}

		}
		return this.baseSalary + total * this.commisions;
	}

}
