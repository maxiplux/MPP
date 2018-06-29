package lesson5.labs.prob2;

public class MallardDuck  extends Duck {
	
	
	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stu
		this.flyBehavior= new FlyWithWings();
		this.quackBehavior=new Quack();
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
