package lesson7.labs.prob4;

public interface Squeakable{
	public default void quack() {
		System.out.println("	squeaking");
	}
}
