package lesson8.labs.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {
	// (String x) -> x.toUpperCase()
	Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
	Function<String, String> toUpper2 = String::toUpperCase;
	// Method reference type: Class::instanceMethod

	// A. (Employee e) -> e.getName()
	Function<Employee, String> getName1 = (x) -> x.getName();
	Function<Employee, String> getName2 = Employee::getName;
	// Class::instanceMethod

	// B. (Employee e,String s) -> e.setName(s)
	BiConsumer<Employee, String> setName1 = (x, y) -> x.setName(y);
	BiConsumer<Employee, String> setName2 = Employee::setName;
	// Class::instanceMethod

	// C. (String s1,String s2) -> s1.compareTo(s2)
	BiFunction<String, String, Integer> compare1 = (s1, s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> compare2 = String::compareTo;
	// Class::instanceMehod

	// D. (Integer x,Integer y) -> Math.pow(x,y)
	BiFunction<Integer, Integer, Double> pow1 = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> pow2 = Math::pow;
	// Class::staticMethod

	// E. (Apple a) -> a.getWeight()
	Function<Apple, Double> getWeight1 = a -> a.getWeight();
	Function<Apple, Double> getWeight2 = Apple::getWeight;
	// Class::instanceMethod

	// F. (String x) -> Integer.parseInt(x);
	Function<String, Integer> parseInt1 = x -> Integer.parseInt(x);
	Function<String, Integer> parseInt2 = Integer::parseInt;
	// Class::staticMethod
	
	// G. EmployeeNameComparator comp = new EmployeeNameComparator();
	// (Employee e1, Employee e2) -> comp.compare(e1,e2)
	EmployeeNameComparator comp = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> comparator1 = (e1,e2) -> comp.compare(e1, e2);
	BiFunction<Employee, Employee, Integer> comparator2 = comp::compare;
	
	Comparator<Employee> comparator3 = (e1,e2) -> comp.compare(e1, e2);
	Comparator<Employee> comparator4 = comp::compare;
	// object::instance Method
	

	void evaluator() {
		System.out.println(toUpper2.apply("hello"));
		/// test your other method references
		Employee dan = new Employee("Daniel");

		System.out.println(getName2.apply(dan));

		setName2.accept(dan, "Son");
		System.out.println(dan.getName());

		System.out.println(compare2.apply("C", "B"));

		System.out.println(pow2.apply(2, 6));

		Apple ap = new Apple(200);
		System.out.println(getWeight2.apply(ap));
		
		System.out.println(parseInt2.apply("213"));
		
		Employee danny = new Employee("Daniel");
		System.out.println(comparator2.apply(dan, danny));
		
		System.out.println(comparator3.compare(dan, danny));
	}

	public static void main(String[] args) {
		Examples main = new Examples();
		main.evaluator();
	}
}
