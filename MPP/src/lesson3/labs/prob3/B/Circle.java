package lesson3.labs.prob3.B;

public class Circle  extends Cylinder{

	public Circle(double radius) {
		super(radius, 0);
		
	}
	
	public double computeArea()
	{
		return Math.PI*this.getRadius()*this.getRadius() ;
	}
	

	
}
