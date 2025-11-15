package OOPS.Practice.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son p = new Son(2003);
        p.career("Engineer");
        p.partner("someone",22);
//        Parent mom = new Parent();
        Parent.hello();

    }
}
