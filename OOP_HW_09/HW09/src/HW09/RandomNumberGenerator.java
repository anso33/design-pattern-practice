package HW09;

import java.util.Random;

// subject를 구현한 concrete subject
public class RandomNumberGenerator extends NumberGenerator{

    private Random random = new Random();

    private int number;

    @Override
    public int getNumber() {
        return (number);
    }

    @Override
    public void execute() {
        number = random.nextInt();
        System.out.println("난수를 생성하였습니다.");
        notifyObservers(this.getNumber());
    }
}
