package BitManipulation;

public class Bit{
    public static void getBit(int n,int pos){
        int bitMask=1<<pos;
        if ((bitMask & n)==0) {
            System.out.println("bit was 0");
        }
        else
        System.out.println("bit was 1");
    }
    public static int setBit(int n,int pos){
        int bitMask=1<<pos;
        return bitMask | n; 
    }
    public static int clearBit(int n,int pos){
        int bitMask=1<<pos;
        return ~(bitMask)&n;
    }
    public static int updateBit(int n,int pos,int value){
        if (value==1) {
            return setBit(n, pos);
        }
        else if (value==0) {
            return clearBit(n, pos);      
        }
        else{
            System.out.println("Enter a valid manipulation bit");
            return -1;
        }
    }
    public static void main(String[] args) {
       int n=5;
    //    getBit(n, 1);
    //    n=setBit(n, 1);
    //    getBit(n, 1);
    n=updateBit(n, 3, 0);
    System.out.println(n);

    }
}