package lesson7.labs.prob4;

public interface Unquackable {
	public default void quack() {
		System.out.println("	cannot quack");
	}
}
