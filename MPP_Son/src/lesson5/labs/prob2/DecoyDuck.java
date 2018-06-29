package lesson5.labs.prob2;

import lesson5.labs.prob2.flyTypes.CannotFly;
import lesson5.labs.prob2.quackTypes.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
	}
}
