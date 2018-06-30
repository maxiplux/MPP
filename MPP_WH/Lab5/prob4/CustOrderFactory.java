package prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	
	public static Customer createCustomer(String name){
		
		return Customer.createCustomer(name);
	}
	
	public static Order createOrder(Customer cst, LocalDate date){
		if( cst==null) new NullPointerException("customer can not be null");
		return Order.newOrder(cst, date);
	}
	
	public static Item createItem(String name){
	
		return Item.createItem(name);
	}

}
