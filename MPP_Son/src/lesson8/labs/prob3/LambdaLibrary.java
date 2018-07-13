package lesson8.labs.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaLibrary {
	public static final BiFunction<Double, Double, List<Double>> 
	BI_FUNC =  (x,y) -> {
		List<Double> list = new ArrayList<>();
		list.add(Math.pow(x,y));
		list.add(x * y);
		return list;
		};	
}
