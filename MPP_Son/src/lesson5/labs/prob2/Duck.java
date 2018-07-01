package lesson5.labs.prob2;

import lesson5.labs.prob2.interfaces.FlyBehavior;
import lesson5.labs.prob2.interfaces.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior fb;
	protected QuackBehavior qb;
		
	public abstract void display();

	public void quack() {
		qb.quack();
	}
	
	public void fly() {
		fb.fly();
	}
	
	public void swim()
	{
		System.out.println("\tSwimming");
	}
}
