package lesson7.labs.prob4;

public class DecoyDuck extends Duck implements Unflyable, Unquackable {

	@Override
	public void display() {
		System.out.println("	displaying");

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Unquackable.super.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Unflyable.super.fly();
	}

}
