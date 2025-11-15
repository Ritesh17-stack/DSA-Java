package OOPS.Practice;

class Student{
    int rno;
    String name;

    float marks;
    Student(){
        // calling another constructor through constructor
        this (2230274,"Ritesh", 90.0f);
    }
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
public class Main {
    public static void main(String args[]){
        Student ritesh = new Student();
        System.out.println(ritesh.name);
        String name = "Ritesh";
        System.out.println(name.toLowerCase());
        int a =5;
        System.out.println(ritesh);

    }
}
