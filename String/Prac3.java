package String;

import java.util.Scanner;

// Q3Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. 
// Display that username to the user.
public class Prac3 {
    public static void main(String[] args) {
        System.out.print("Enter your email : ");
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        String username="";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                username=email.substring(0, i);
                break;
            }
        }
        System.out.println(username);
    }

}
