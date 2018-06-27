package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building>  bdList = new ArrayList<Building>();

	public List<Building> getBdList() {
		return bdList;
	}
	
	public double getProfits() {
		int p=0;
		for(Building bd:bdList) {
			p+=bd.calculateProfits();
		}
		return p;
	}
	
	
	
}
