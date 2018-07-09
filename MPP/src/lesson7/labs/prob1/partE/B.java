package lesson7.labs.prob1.partE;

public interface B extends  A {
	
	@Override
	 public default int method() {
		 return 1;
	 }

}
