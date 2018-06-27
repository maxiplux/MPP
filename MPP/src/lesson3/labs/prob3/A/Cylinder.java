package lesson3.labs.prob3.A;

public class Cylinder {
	private  double radius;
	private  double height;
	
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public Cylinder(double radius, double height) {
		 
		this.radius = radius;
		this.height = height;
	}
	double computeArea()
	{
		return 2*Math.PI*this.radius*this.height; 
	}
	

}
