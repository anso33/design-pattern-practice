package HW07;

public abstract class Car {

    public final void   run()
    {
        startCar();
        drive();
        stop();
        turnOff();
    }

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    abstract void drive();

    abstract void stop();

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
