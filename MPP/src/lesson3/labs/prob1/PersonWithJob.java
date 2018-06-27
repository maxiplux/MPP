package lesson3.labs.prob1;

public class PersonWithJob  {
	
	private double salary;
	Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		this.person=new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) {
			return false;
		}
		if(getClass() != aPerson.getClass()) {
			return false;
		}
		
		PersonWithJob p = (PersonWithJob) aPerson;		
		return super.equals(p.person) && this.getSalary()==p.getSalary();
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		
		// Original problem , happend because the object p2 is  type PersonWithJob and 
		//  when we compare using  !(aPerson instanceof PersonWithJob) the conditional return true and for this reason return false
		//
		
	}


}
