package HW09;

public class Test09 {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);

        System.out.println("\ngenerator excute");
        System.out.println("===============================");
        generator.execute();

        System.out.println("\ndelete digitObserver");
        System.out.println("===============================");
        generator.deleteObserver(observer1);

        System.out.println("\ngenerator excute");
        System.out.println("===============================");
        generator.execute();
   }
}
