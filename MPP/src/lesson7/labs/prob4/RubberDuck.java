package lesson7.labs.prob4;

public class RubberDuck  extends Duck implements FlyBehavior,QuackBehavior{

	@Override
	public void quack() {
		System.out.println("	squeaking");
		
	}

	@Override
	public void display() {
		System.out.println("	displaying");
		
	}
	
	@Override
	public void fly() {
		System.out.println("	can not fly");
	}
	
	

}
