package String;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        StringBuilder ch =new StringBuilder(sc.nextLine());
        System.out.println(ch);
        for(int i = 0 ; i<ch.length()/2;i++){
            char temp = ch.charAt(i);
            ch.setCharAt(i, ch.charAt(ch.length()-1-i));
            ch.setCharAt(ch.length()-1-i, temp);
        }
        System.out.println(ch);

    }
}
