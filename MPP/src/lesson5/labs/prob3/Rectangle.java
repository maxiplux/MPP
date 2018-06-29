package lesson5.labs.prob3;

class Rectangle implements Shape {
	private double width;
	private double height;
	
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	public double getWidth() {
		return width;
	}



	public double getHeight() {
		return height;
	}



	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
