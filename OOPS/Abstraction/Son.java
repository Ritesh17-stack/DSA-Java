package OOPS.Abstraction;
public class Son extends Parent{
    Son(int age){
       super(age);
    }
    @Override
    void career(){
        System.out.println("I am going to be a coder");
    }
    @Override
    void partner(){
        System.out.println("I love SpiderMan");
    }

}
