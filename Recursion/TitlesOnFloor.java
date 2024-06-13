package Recursion;
// Find no of ways in which a tile of size 1 X m can be fitted on a floor of size n X m;
public class TitlesOnFloor {
    public static int countWays(int n,int m){
        if (n==m) {
            return 2;
        }
        if (n<m) {
            return 1;
        }
        int vertically = countWays(n-m, m);
        int horizontally = countWays(n-1, m);
        return horizontally+vertically;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        int ways =countWays(n, m);
        System.out.println(ways);
    }
}
