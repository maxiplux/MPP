package lesson5.labs.prob2;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		this.setFlywithwings(new FlyWithWings());
		this.setQuack(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
}
