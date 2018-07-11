package lesson8.labs.prob1;

import java.util.function.Supplier;

public class MyClass2 {
	static class CustomSupplier implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}

	public static void main(String[] args) {
		System.out.println(new CustomSupplier().get());
	}
}
