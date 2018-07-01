package lesson5.labs.prob2;

public class RubberDuck  extends Duck {
	
	
	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stu
		this.flyBehavior= new CannotFly();
		this.quackBehavior=new Squeak();
	}


	@Override
	public void fly() {
		
		// TODO Auto-generated method stub
		this.flyBehavior.fly();
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.quackBehavior.quack();
		
	}

	
	
	
	

}
