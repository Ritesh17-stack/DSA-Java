package OOPS.Interface;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("I start the music normally");
    }
    @Override
    public void stop(){
        System.out.println("I stop the music normally");
    }
}

