package lesson3.labs.prob2;

public class Apartment {
	private double rents;
	Building building;

	public Apartment(double rents,Building bd) {
		if(bd==null) 
			throw  new IllegalArgumentException(" building should not be null");
		this.rents = rents;
		this.building=bd;
		bd.getApts().add(this);
	}
	
	public Apartment(Building bd) {
		this.rents = 0;
		if(bd==null) 
			throw  new IllegalArgumentException(" building should not be null");
		this.building=bd;
		bd.getApts().add(this);
	}
	

	public double getRents() {
		return rents;
	}

	public void setRents(double rents) {
		this.rents = rents;
	}
	
	

}
