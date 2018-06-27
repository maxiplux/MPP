package lesson3.labs.prob3.B;

public class Cylinder {

	private Circle c;

	private double height;

	@Override
	public String toString() {
		return String.format("Cylinder radius(%s)/height(%s) ", this.getRadius(), this.height);
	}

	public double getRadius() {
		return c.getRadius();
	}

	public double getHeight() {
		return height;
	}

	public Cylinder(double radius, double height) {
		c = new Circle(radius);
		this.height = height;
	}

	double computeVolume() {
		return c.computeArea() * this.height;
	}

}
