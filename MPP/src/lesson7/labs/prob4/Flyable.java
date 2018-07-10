package lesson7.labs.prob4;

public interface Flyable {
	default void fly() {
		System.out.println("	fly with wings");
	}
}
