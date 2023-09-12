package example;

import javax.imageio.ImageReader;

public class ExampleSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		System.out.println("=====================================");
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();

		System.out.println("=====================================");
		model.setFlyBehavior(new FlyWithRocketPowered());
		System.out.println("now, we change the behavior of model duck");
		model.performFly();
	}
}
