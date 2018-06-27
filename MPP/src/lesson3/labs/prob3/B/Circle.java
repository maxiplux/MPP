package lesson3.labs.prob3.B;

public class Circle{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

	@Override
	public String toString() {
		return String.format("Circle Id(%s) with Area (%s)", this.hashCode(), this.computeArea());
	}

}
