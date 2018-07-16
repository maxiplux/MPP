package lesson11.labs.prob6;

import java.util.*;
import java.util.function.*;

public class Main {
	public static <T> boolean contains1(List<T> list, T s , BiPredicate<T, T> predicate) {
		return list.stream().filter((x) -> predicate.test(x, s) ).count() != 0;
	}
	public static <T> boolean contains4(List<T> list, T s , BiPredicate<? super  T, ? super T> predicate) {
		return list.stream().filter((x) -> predicate.test(x, s) ).count() != 0;
	}
	public static <T,U> boolean contains5(List<T> list,U s , BiPredicate<  U, U> predicate) 
	{
		return list.stream().filter((x) -> predicate.test((U) x, s) ).count() != 0;
	}

	public static void test1() 
	{
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom" , (String e1 , String e2)-> e1.equals(e2) );
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		Employee e = new Employee(1001, "Joe", 50000);
		
		boolean foundIt = Main.contains1(list, e,(Employee e1, Employee e2) -> e1.getId()==e2.getId() );
		System.out.println(foundIt);
		}

	 

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}

	private static void test5() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		Account a = new CheckingAccount(1002, 35.00);
		boolean foundIt = Main.contains5(list, a,
		 (Account a1, Account a2) -> a1.getAcctId()==a2.getAcctId());
		System.out.println(foundIt);

		
	}
	


	private static void test4() {

		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains4(list, m,
		 (Employee e, Person p) -> e.getName().equals(p.getName()));
		System.out.println(foundIt);
		
	}
	
	

	private static void test3() {
		
			List<Manager> list = new ArrayList<>();
			list.add(new Manager(1003, "Tom", 60000, 700));
			list.add(new Manager(1002, "Harry", 70000, 400));
			list.add(new Manager(1001, "Joe", 50000, 500));
			Manager m = new Manager(1001, "Joe", 50000, 500);
			
			boolean foundIt = Main.contains1(list, m,
			 (Manager e1, Manager e2) -> e1.getId()==e2.getId());
			System.out.println(foundIt);
		
	}

}
