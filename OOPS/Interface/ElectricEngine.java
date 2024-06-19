package OOPS.Interface;

public class ElectricEngine implements Engine{
    public ElectricEngine() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Electric Starts Engine");
    }

    @Override
    public void stop() {
        System.out.println("Electric Stops Engine");

    }

    @Override
    public void acc() {
        System.out.println("Electric Accelerates Engine");
    }
}
