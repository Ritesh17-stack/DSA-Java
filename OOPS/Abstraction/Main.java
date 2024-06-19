package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son s1 = new Son(14);
        Parent s2 = new Son(13); //we can use abstract class for referencing
        System.out.println(s2.age);
        s1.career();
        Daughter d1 = new Daughter(15);
        d1.career();
    }
}
