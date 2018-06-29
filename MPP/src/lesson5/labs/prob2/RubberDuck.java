package lesson5.labs.prob2;

import lesson5.labs.prob2.flyTypes.CannotFly;
import lesson5.labs.prob2.quackTypes.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		fb = new CannotFly();
		qb = new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
	}
}
