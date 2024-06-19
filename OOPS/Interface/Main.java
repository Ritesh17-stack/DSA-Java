package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car2 = new Car();
//        CDPlayer car3 = new CDPlayer();
//        car3.start();
//        car3.stop();
//        car3.acc();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.updateEngine();
        car.start();
    }
}
