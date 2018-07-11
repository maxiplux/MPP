package lesson8.labs.prob6;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example {

	Function<Employee, String> getName1 = (Employee e) -> e.getName();
	Function<Employee, String> getName2 = Employee::getName;
	// Method reference type:Class::instanceMethod

	// (Employee e,String s) -> e.setName(s) ;
	BiConsumer<Employee, String> set1 = (e, s) -> e.setName(s);
	BiConsumer<Employee, String> set2 = Employee::setName;

	// (String s1,String s2) -> s1.compareTo(s2)
	BiFunction<String, String, Integer> compare1 = (String s1, String s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> compare2 = String::compareTo;

	// D.
	// (Integer x,Integer y) -> Math.pow(x,y) ;
	BiFunction<Integer, Integer, Double> pow1 = (Integer x, Integer y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> Pow2 = Math::pow;

	// E. (Apple a) -> a.getWeight()
	Function<Apple, Double> getW1 = a -> a.getWeight();
	Function<Apple, Double> getW2 = Apple::getWeight;
	// Method reference type:Class::instanceMethod

	// F. (String x) -> Integer.parseInt(x);
	Function<String, Integer> pInt1 = x -> Integer.parseInt(x);
	Function<String, Integer> pInt2 = Integer::parseInt;
	// Method reference type:Class::staticMethod

	// G. EmployeeNameComparator comp = new EmployeeNameComparator();
	// (Employee e1, Employee e2) -> comp.compare(e1,e2)

	// BiFunction< Employee, Employee, Integer>
	// comp1= (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
	// BiFunction< Employee, Employee, Integer>
	// Comp2 = Employee::compareTo;
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> cp1 = (e1, e2) -> comp.compare(e1, e2);
	Comparator<Employee> cp2 = comp::compare;
	// Method reference type:obect::instanceMethod

	void evaluator() {
		Employee he = new Employee("wenxin");
		System.out.println(getName2.apply(he));
		set1.accept(he, "vin");
		System.out.println("after set vin:" + he.name);
		/// test your other method references
		System.out.println(getW1.apply(new Apple(1)));
		System.out.println(getW2.apply(new Apple(2)));

		System.out.println(pInt1.apply("5"));
		System.out.println(pInt2.apply("5"));

		System.out.println(cp1.compare(new Employee("1"), new Employee("2")));
		System.out.println(cp2.compare(new Employee("1"), new Employee("2")));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example().evaluator();
	}

	static class Apple {
		Apple(double weight) {
			this.weight = weight;
		}

		private double weight;

		public double getWeight() {
			return weight;
		}
	}

}
