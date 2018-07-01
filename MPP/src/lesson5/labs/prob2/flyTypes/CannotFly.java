package lesson5.labs.prob2.flyTypes;

import lesson5.labs.prob2.interfaces.FlyBehavior;

public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("\tCannot Fly");
	}
	
}
