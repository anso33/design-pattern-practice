package HW09;

import java.util.ArrayList;
import java.util.List;

// subject 인터페이스 일대다관계에서 일
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("add observer");
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("delete observer");
    }

    public void notifyObservers(int randomNum) {
        for (Observer ob : observers) {
            ob.update(randomNum);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
