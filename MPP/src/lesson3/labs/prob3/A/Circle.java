package lesson3.labs.prob3.A;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(radius, 0);

	}

	public double computeArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

	@Override
	public String toString() {
		return String.format("Circle Id(%s) with Area (%s)", this.hashCode(), this.computeArea());
	}

}
