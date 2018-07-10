package lesson7.labs.prob4;

public interface Unflyable extends Flyable {
	public default void fly() {
		System.out.println("	can not fly");
	}
}
