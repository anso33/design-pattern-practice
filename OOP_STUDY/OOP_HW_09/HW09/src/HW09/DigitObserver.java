package HW09;

public class DigitObserver implements Observer {

    @Override
    public void update(int randomNum) {
        System.out.println("DigitObserver number change " + randomNum);
    }
}
