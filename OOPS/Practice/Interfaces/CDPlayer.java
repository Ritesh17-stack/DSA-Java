package OOPS.Practice.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("I started the music");
    }

    @Override
    public void stop() {
        System.out.println("I stopped the music");
    }
}
