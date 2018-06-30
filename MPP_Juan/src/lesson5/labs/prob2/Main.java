package lesson5.labs.prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks= {
				new MalllarDuck(),
				new DecoyDuck(),
				new RedHeadDuck(),
				new RubberDuck(),
		};
		
		for (Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName()+":");
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
			
			
		}

	}

}
