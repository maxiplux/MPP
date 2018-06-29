package lesson5.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sps= {
				new Triangle(1,2),
				new Rectangle(2,4),
				new Circle(10)
		};
		
		double total=0;
		for(Shape s: sps) total+=s.computeArea();
			
			System.out.println("Sum of Areas:"+ total);
		
	}

}
