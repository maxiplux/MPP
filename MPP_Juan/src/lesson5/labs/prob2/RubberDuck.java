package lesson5.labs.prob2;

public class RubberDuck extends Duck {
	

	public RubberDuck() {
		this.setFlywithwings(new CannotFly());
		this.setQuack(new Quack());
	}
	
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
}
