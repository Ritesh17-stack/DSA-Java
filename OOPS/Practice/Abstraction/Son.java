package OOPS.Practice.Abstraction;

public class Son extends Parent{
    public Son(int year) {
        super(year);
    }

    String name;
    String partner;
    int age;
    @Override
    void career(String name) {
        this.name = name;
        System.out.println("I want to be "+ name);
    }

    @Override
    void partner(String name,int age) {
        this.partner = name;
        this.age=age;
        System.out.println("I love "+this.partner+" and she is of " + age+ " years");
    }
}
