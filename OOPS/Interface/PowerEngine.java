package OOPS.Interface;

public class PowerEngine implements Engine {
    public PowerEngine() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Power Starts Engine");
    }

    @Override
    public void stop() {
        System.out.println("Power Stops Engine");

    }

    @Override
    public void acc() {
        System.out.println("Power Accelerates Engine");
    }
}

