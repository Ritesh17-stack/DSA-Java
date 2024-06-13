package Recursion;
// Find the nuumber of ways in which you can invite n people in a party single or in pair.
public class CallGuest {
    public static int callGuest(int n){
        if (n<=1) {
            return 1;
        }
        int single = callGuest(n-1);
        int pairs =(n-1)*callGuest(n-2);
        return single+pairs;
    }
    public static void main(String[] args) {
        int n=4;
        int no_of_ways=callGuest(n);
        System.out.println(no_of_ways);
    }
}
