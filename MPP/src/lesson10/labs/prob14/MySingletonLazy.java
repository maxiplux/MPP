package lesson10.labs.prob14;

import java.util.Optional;
import java.util.function.Supplier;

public class MySingletonLazy {
	
	private static Optional<MySingletonLazy> opt=Optional.empty();
	static int count;
	private MySingletonLazy(){
		count++;
	}

	public static MySingletonLazy createSingleteon(){
		if(!opt.isPresent()) {
			opt=Optional.of(new MySingletonLazy());
		}
		return opt.get();
	}
	
	
	public static void main(String[] args){
		System.out.println(createSingleteon().count);
		System.out.println(createSingleteon().count);
	}
	
}
