package lesson5.labs.prob2;

public class MalllarDuck extends Duck {


	public MalllarDuck() {
		this.setFlywithwings(new FlyWithWings());
		this.setQuack(new Quack());
	}
	
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
 

}
