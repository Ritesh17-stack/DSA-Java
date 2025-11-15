package OOPS.Practice.staticBlock;

public class StaticBlock {
    static int a = 4;
    static int b;

    //This is a static block which only runs once
    static{
        System.out.println("I am in static block");
        b = a*4;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
