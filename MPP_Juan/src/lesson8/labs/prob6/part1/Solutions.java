package lesson8.labs.prob6.part1;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		evaluator();
		

		// G. EmployeeNameComparator comp = new EmployeeNameComp
	}
	public static  void evaluator()
	{

		Employee juanF= new Employee("Juan F", 9949484);
		Employee rivaldo= new Employee("Rivaldo", 9949484);

		//G. EmployeeNameComparator comp = new EmployeeNameComparator();
		//(Employee e1, Employee e2) -> comp.compare(e1,e2)
		
		Comparator<Employee> G = (s1, s2) -> s1.name.compareTo(s2.getName()) == 0
				? s1.getSalary() == s2.getSalary() ? 0 : s1.getSalary() < s2.getSalary() ? -1 : 1
				: s1.name.compareTo(s2.getName()) > 0 ? 1 : -1 ;
		

		Comparator<Employee> G2 = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);
		
		System.out.println(G.compare(rivaldo, juanF));
		System.out.println(G2.compare(rivaldo, juanF));
		
		// A. (Employee e) -> c

				Function<Employee, String> A = (Employee x) -> x.getName();
				Function<Employee, String> A2 = Employee::getName;
				

				// B. (Employee e,String s) -> e.setName(s)

				BiConsumer<Employee, String> B = (Employee x, String s) -> x.setName(s);
				BiConsumer<Employee, String> B2 = Employee::setName;
				
				 B.accept(juanF,"Romario");
				 B2.accept(juanF,"Romario de Asis");
				 
				 System.out.println(A.apply(juanF));
				 System.out.println(A2.apply(juanF));

				// C. (String s1,String s2) -> s1.compareTo(s2)

				Comparator<String> C = (s1, s2) -> s1.compareTo(s2);
				

				Comparator<String> C2 = String::compareTo;
				
				System.out.println(C.compare("rivado", "JuanF"));
				System.out.println(C2.compare("rivado", "JuanF"));
				

				
				// D. (Integer x,Integer y) -> Math.pow(x,y)
				BiFunction<Integer, Integer,Double> D = (Integer x,Integer y ) -> Math.pow(x,y);
				BiFunction<Integer, Integer,Double> D1 =  Math::pow;
				
				System.out.println(D.apply(2, 2));
				System.out.println(D1.apply(2, 2));

				// E. (Apple a) -> a.getWeight()
				
				Function<Apple, Double> E = (Apple x) -> x.getWeight();
				Function<Apple, Double> E1 =Apple::getWeight;
				Apple apple= new Apple(8.0);
				
				System.out.println(E.apply(apple));
				System.out.println(E1.apply(apple));

				// F. (String x) -> Integer.parseInt(x);
				Function<String , Integer> F = (String x) -> Integer.parseInt(x);
				Function<String , Integer> F2 = Integer::parseInt;
				
				System.out.println(F.apply("56"));
				System.out.println(F2.apply("56"));
				
				
				 
				
	}
	

}
