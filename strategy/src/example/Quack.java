package example;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can speak!!! Quack! Quack!");
	}
}
