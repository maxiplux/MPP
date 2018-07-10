package lesson7.labs.prob4;

public interface Squeakable {
	public default void fly() {
		System.out.println("	cannot quack");
	}
}
