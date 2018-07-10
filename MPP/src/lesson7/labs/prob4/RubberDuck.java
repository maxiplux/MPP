package lesson7.labs.prob4;

public class RubberDuck extends Duck implements Squeakable , Unflyable{

	@Override
	public void display() {
		System.out.println("	displaying");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Unflyable.super.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Squeakable.super.quack();
	}	

}
