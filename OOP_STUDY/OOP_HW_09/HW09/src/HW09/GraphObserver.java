package HW09;

public class GraphObserver implements Observer {

    @Override
    public void update(int randomNum) {
        System.out.println("GraphObserver number change " + randomNum);
    }
}
