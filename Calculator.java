
import java.util.*;
class Calculator{
    public static void main(String args[]){
        int a,b,input;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Division");
        System.out.println("Press 4 for Multiplication");
        System.out.println("Press 5 for Modulo\n");
        System.out.print("Enter your choice: ");
        input=sc.nextInt();
        sc.close();
        switch (input) {
            case 1:{
                System.out.println("The sum is "+(a+b));
                
                break;
            }
            case 2:{
                System.out.println("The diff is "+(a-b));
                break;
            }
            case 3:{
                System.out.println("The div is "+(a/b));
                break;
            }
            case 4:{
                System.out.println("The product is "+(a*b));
                break;
            }
            case 5:{
                System.out.println("The modulo is "+(a%b));
                break;
            }
            default:
            System.out.println("Enter form range 1-5");
                break;
        }
    }
}