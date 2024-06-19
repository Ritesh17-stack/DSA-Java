package OOPS.Abstraction;
// If a class has 1 or more abstract method, then the class must be declared as abstract
//We cant create objects and abstract constructor of abstract class
//We cant create abstract static method, but we can create static method
//We cannot have final as class type

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();
    static void hello() {

    }

}
