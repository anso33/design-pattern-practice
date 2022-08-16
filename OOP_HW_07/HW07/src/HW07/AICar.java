package HW07;

public class AICar extends Car{

    @Override    // 후크
    public void startCar() {
        super.startCar();
        System.out.println("자율 주행합니다.");
    }

    @Override
    void drive() {
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}
