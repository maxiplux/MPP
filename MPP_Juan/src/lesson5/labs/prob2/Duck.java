package lesson5.labs.prob2;

public abstract class Duck {
	
	private FlyBehavior  flywithwings;
	private QuackBehavior quack;
	
	
	
	abstract void display();


	public void fly() {
		flywithwings.fly();
	}
	
	public void quack() {
		quack.quack();
	}


	public void setFlywithwings(FlyBehavior flywithwings) {
		this.flywithwings = flywithwings;
	} 

	public void setQuack(QuackBehavior quack) {
		this.quack = quack;
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	

}
