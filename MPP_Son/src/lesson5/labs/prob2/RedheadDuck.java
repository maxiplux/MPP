package lesson5.labs.prob2;

import lesson5.labs.prob2.flyTypes.FlyWithWings;
import lesson5.labs.prob2.quackTypes.Quack;

public class RedheadDuck extends Duck {
	
	public RedheadDuck()
	{
		fb = new FlyWithWings();
		qb = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("\tdisplaying");
	}
}
