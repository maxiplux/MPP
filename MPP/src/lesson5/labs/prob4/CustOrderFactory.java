package lesson5.labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	
	public static Item newItem(Order o, String name)
	{
		if(o == null)
			throw new NullPointerException("Null Order");
		o.addItem(name);
		return new Item(name);
	}
	
	public static Order newOrder(Customer cus, LocalDate date)
	{
		if(cus == null)
			throw new NullPointerException("Null Order");
		Order order = new Order(date);
		cus.addOrder(order);
		return order;
	}
	
	public static Customer newCustomer(String name)
	{
		return new Customer(name);
	}
}
