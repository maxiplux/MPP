package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.Customer;
import lesson5.labs.prob4.Order;
import lesson5.labs.prob4.CustOrderFactory;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.newCustomer("Bob");
		
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.newItem(order, "Shirt");
		CustOrderFactory.newItem(order, "Laptop");
		
		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.newItem(order, "Pants");
		CustOrderFactory.newItem(order, "Knife set");
		
		System.out.println(cust.getOrders());
	}
}

		
