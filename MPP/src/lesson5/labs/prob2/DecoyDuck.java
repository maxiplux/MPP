package lesson5.labs.prob2;

public class DecoyDuck  extends Duck {
	
	
	public DecoyDuck() {
		super();
		// TODO Auto-generated constructor stu
		this.flyBehavior= new CannotFly();
		this.quackBehavior=new MuteQuack();
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
