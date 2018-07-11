package lesson8.labs.prob1;

import java.util.function.Function;
import java.util.function.Supplier;

public class MyClass {
	private String name;

	MyClass(String name) {
		this.name = name;
	}

	boolean myMethod(MyClass cl) {
		Function<MyClass, Boolean> bifunc = this::equals;
		return bifunc.apply(cl);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		MyClass class1 = new MyClass("Son");
		MyClass class2 = new MyClass("Daniel");
		MyClass class3 = new MyClass("Son");

		System.out.println(class1.myMethod(class2));
		System.out.println(class1.myMethod(class3));

	}
}
