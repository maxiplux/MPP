package lesson5.labs.prob2;

public class DecoyDuck extends Duck {


	public DecoyDuck() {
		this.setFlywithwings(new CannotFly());
		this.setQuack(new MuteQuack());
	}
	
	public void display() {
		System.out.println("displaying");
	}

}
