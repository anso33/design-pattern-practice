package example;

public class ModelDuck extends Duck{

	public ModelDuck() {
		quackBehavior = new SQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
