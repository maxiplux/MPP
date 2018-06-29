package lesson5.labs.prob3;

public class Triangle implements Shape {
	private double base;
	private double height;
	
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	
	public double getBase() {
		return base;
	}



	public double getHeight() {
		return height;
	}



	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return base*height/2;
	}

}
