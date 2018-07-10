package lesson7.labs.prob4;

public class Main {

	public static void main(String[] args) {

		Object[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };
		FlyBehavior fy = new MallardDuck();

		for (Object d : ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			((Duck) d).display();
			((FlyBehavior) d).fly();
			((QuackBehavior) d).quack();
			((Duck) d).swim();
		}
	}
}
