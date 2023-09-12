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
	}
}
