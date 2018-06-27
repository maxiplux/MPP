package lesson3.labs.prob3.A;

public class Circle{

	private Cylinder cyl;
	
	public Circle(double radius) {
		cyl = new Cylinder(radius, 0);
	}
	
	public double getRadius()
	{
		return this.cyl.getRadius();
	}
	
	public double computeArea()
	{
		return Math.PI*this.getRadius()*this.getRadius() ;
	}
	
}
