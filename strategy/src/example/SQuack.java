package example;

public class SQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I can speak.. SQuack! SQuack!");
	}
}
