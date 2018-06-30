package lesson5.labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	
	public static Item newItem(Order o, String name)
	{
		if(o == null)
			throw new NullPointerException("Null Order");
		Item i = new Item(name);
		o.addItem(i);
		return i;
	}
	
	public static Order newOrder(Customer cus, LocalDate date)
	{
		if(cus == null)
			throw new NullPointerException("Null Customer");
		Order order = new Order(date);
		cus.addOrder(order);
		return order;
	}
	
	public static Customer newCustomer(String name)
	{
		return new Customer(name);
	}
}
