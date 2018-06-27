package lesson3.labs.prob3.A;

public class TestClass {

	public static void main(String[] args) {
		//Does it make 		sense to use inheritance here? -> Yes , 
		//because we can delete the height on Cylinder or remove vertical dimension , to make a circle
		Circle earth = new Circle(3.959);		
		System.out.printf("The Earth(%s) Area if it  was a circle is %s mi \n",earth, earth.computeArea());
		
		
		Cylinder cilinder = new Cylinder(3.959,100);		
		System.out.printf("We have a Cilinder (%s) with Volume : %s \n",cilinder, cilinder.computeVolume());
		
	}
}
