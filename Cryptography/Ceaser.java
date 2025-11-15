package Cryptography;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ceaser {
    public static boolean hasNumberOrSpecial(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || !Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    public static String encipher(String pt){
        if(hasNumberOrSpecial(pt)){
            return "Enter a pure alphabetic string..";
        }
        StringBuilder ct = new StringBuilder();
        for(char c : pt.toCharArray()){
            if(Character.isUpperCase(c)){
                ct.append((char) ((c- 'A' +3) % 26 + 'A'));
            }
            else if(Character.isLowerCase(c)){
                ct.append((char) ((c- 'a' +3) % 26 + 'a'));
            }
        }
        return ct.toString();
    }
    public static String decipher(String ct){
        if(hasNumberOrSpecial(ct)){
            return "Enter a pure alphabetic string..";
        }
        StringBuilder pt = new StringBuilder();
        for(char c : ct.toCharArray()){
            if(Character.isUpperCase(c)){
                pt.append((char) ((c - 'A' - 3 + 26) % 26 + 'A'));
            }
            else if(Character.isLowerCase(c)){
                pt.append((char) ((c- 'a' - 3 + 26) % 26 + 'a'));
            }
        }
        return pt.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Crypto World!!!");
        System.out.println("What do you want :");
        System.out.println("1. Encipher");
        System.out.println("2. Decipher");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        while (true) {
            if (opt == 1) {
                System.out.println("Enter Plain Text");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println("cipher text: "+ encipher(str));
                break;
            } else if (opt == 2) {
                System.out.println("Enter Cipher Text");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.print("plain text: ");
                System.out.println(decipher(str));
                break;
            } else {
                System.out.println("Select a valid option...");
            }
        }
    }
}