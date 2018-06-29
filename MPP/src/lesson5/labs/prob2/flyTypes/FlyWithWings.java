package lesson5.labs.prob2.flyTypes;

import lesson5.labs.prob2.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("\tFly With Wings");
	}
	
}
