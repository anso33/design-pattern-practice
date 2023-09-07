package HW07;

public class ManualCar extends Car{

    @Override    // 후크
    public void startCar() {
        super.startCar();
        System.out.println("사람이 운전합니다.");
    }

    @Override
    void drive() {
    System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }
}
