package lesson3.labs.prob3.Additional;

public class Circle{

	private Cylinder cyl;
	
	public Circle(double radius) {
		cyl = new Cylinder(radius, 0);
	}
	
	public double getRadius()
	{
		return this.cyl.getRadius();
	}
	
	@Override
	public String toString() 
	{
		return String.format("Circle Id(%s) with Area (%s)" , this.hashCode(),this.computeArea()) ;
	}


	public double computeArea()
	{
		return Math.PI*this.getRadius()*this.getRadius() ;
	}
	
}
