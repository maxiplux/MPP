package lesson3.labs.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) {
			return false;
		} 
		if(!(aPerson instanceof Person)) {
			return false;
		}
		
		//System.out.println("true Because are equals a level name ");
		Person p = (Person)aPerson;
		return this.name.equals(p.name);
	}
	public static void main(String[] args) {
		
	}

}
