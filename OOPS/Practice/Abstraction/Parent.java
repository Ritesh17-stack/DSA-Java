package OOPS.Practice.Abstraction;

public abstract class Parent {
    int yob;

    public Parent(int yob) {
        this.yob = yob;
    }

    static void hello(){
        System.out.println("Hey");
    }
    abstract void career(String name);
    abstract void partner(String name, int age);
}