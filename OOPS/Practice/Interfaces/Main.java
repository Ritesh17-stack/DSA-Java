package OOPS.Practice.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.acc();
//        myCar.brake();
//        myCar.start();
//        myCar.stop();
//        Engine myCar1 = new Car();
////        myCar1.brake();
//        ar carMedia = new CDPlayer();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
