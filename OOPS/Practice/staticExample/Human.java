package OOPS.Practice.staticExample;

public class Human {
    int age;
    String name;
    float salary;
    static long population=0;
    public Human(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        //Static variable are accessed via classname
        Human.population+=1;
    }

}
