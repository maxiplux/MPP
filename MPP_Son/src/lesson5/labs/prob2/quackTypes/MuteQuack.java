package lesson5.labs.prob2.quackTypes;

import lesson5.labs.prob2.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("\tCannot Quack");
	}
	
}
