package lesson7.labs.prob4;

public abstract class Duck implements Flyable, Quackable {

	public abstract void display();

	public void swim() {
		System.out.println("	swimming");
	}

}
