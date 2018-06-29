package lesson4.lab4.prob4;

import java.time.LocalDate;

public class Order {
	
	
	private double orderNo;
	private LocalDate orderDate;
	private double OrderAmount;
	private Commissionade commissionade;
	
	
	
	public LocalDate getOrderDate() {
		return orderDate;
	}


	public Order(double orderNo, double orderAmount , LocalDate orderDate,Commissionade commissionade) 
	{
		
		this.orderNo = orderNo;
		this.commissionade=commissionade;
		this.orderDate= orderDate;
		this.OrderAmount = orderAmount;
	}
	
	
	public Order(double orderNo, double orderAmount,Commissionade commissionade) 
	{
		
		this.orderNo = orderNo;
		this.commissionade=commissionade;
		this.commissionade.addOrder(this);
		this.orderDate= LocalDate.now();
		this.OrderAmount = orderAmount;
	}
	
	public double getOrderAmount() {
		return this.OrderAmount;
	}
	

	
}
