package lesson5.labs.prob2.driver;

import lesson5.labs.prob2.DecoyDuck;
import lesson5.labs.prob2.Duck;
import lesson5.labs.prob2.MallardDuck;
import lesson5.labs.prob2.RedheadDuck;
import lesson5.labs.prob2.RubberDuck;

public class Main {
	public static void main(String[] args) {
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };
		
		for(Duck d : ducks)
		{
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}
