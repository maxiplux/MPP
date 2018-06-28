package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String name;
	private double matainenceCost;
	private List<Apartment> apts;
	private Landlord ld;

	public Building(double matainenceCost,Landlord ld,String name) {
		
		if(ld==null) 
			throw  new IllegalArgumentException(" landlord should not be null");
		this.name=name;
		this.matainenceCost = matainenceCost;
		this.ld=ld;
		ld.getBdList().add(this);
		this.apts = new ArrayList<>();
	}

	public Building(Landlord ld) {
		if(ld==null) 
			throw  new IllegalArgumentException(" landlord should not be null");
		this.ld=ld;
		ld.getBdList().add(this);
		this.matainenceCost = 0;
		this.apts = new ArrayList<>();
	}

	public double calculateProfits() {
		double income = 0;
		for (Apartment ap : apts)
			income += ap.getRents();
		return income - matainenceCost;
	}

	public double getMatainenceCost() {
		return matainenceCost;
	}

	public void setMatainenceCost(double matainenceCost) {
		this.matainenceCost = matainenceCost;
	}

	public List<Apartment> getApts() {
		return apts;
	}

}
