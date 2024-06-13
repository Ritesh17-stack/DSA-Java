package Random_Practice;

public class Prac2 {
    public static int count1s(int n){
        int count = 0;
        while(n>0){
            count = count + (n&1);
            n=n>>1;
        }
        return count;
    }
    public static String dec2Bin(int n){
        if(n==0){
            return "0";
        }
        String s="";
        while (n>0) {
            if((n&1)==1){
                s=s+"1";
            }
            else{
                s = s+ "0";
            }
            n=n>>1;
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 2;
        // System.out.println(count1s(n));
        System.out.println(dec2Bin(n));
    }
}
