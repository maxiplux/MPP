package lesson3.labs.prob3.B;

public class TestClass {

	public static void main(String[] args) {
	
		Circle earth = new Circle(3.959);		
		System.out.printf("The Earth(%s) Area if it  was a circle is %s mi \n",earth, earth.computeArea());
		
		
		Cylinder cilinder = new Cylinder(3.959,100);		
		System.out.printf("We have a Cilinder (%s) with Area : %s \n",cilinder, cilinder.computeArea());
		
	}
}
