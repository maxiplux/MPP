package lesson5.labs.prob2;

public abstract class Duck {
	public  FlyBehavior flyBehavior ;
	public  QuackBehavior quackBehavior;
	
	
	
	public Duck() {
		//if(flyBehavior==null&&quackBehavior==null) throw  new NullPointerException("flyBehavior and quackBehvior should not be null ");
	}
	public abstract void fly();
	public abstract void quack();
	
	public  void display() {
		System.out.println("display");
	}
	public  void swim() {
		System.out.println("swimming");
	}

	
	
	

}
