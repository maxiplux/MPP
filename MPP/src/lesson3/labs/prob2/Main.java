package lesson3.labs.prob2;

public class Main {

	public static void main(String[] args) {
		Landlord  ld= new Landlord();
		
		Building bd1= new Building(50,ld);
		
		Apartment ap1= new Apartment(100,bd1);
		Apartment ap2= new Apartment(200,bd1);
		Apartment ap3= new Apartment(300,bd1);
		
		Building bd2= new Building(100,ld);
		Apartment ap4= new Apartment(400,bd2);
		Apartment ap5= new Apartment(500,bd2);
		Apartment ap6= new Apartment(600,bd2);
		
		System.out.println(ld.getProfits());
		
		

	}

}
