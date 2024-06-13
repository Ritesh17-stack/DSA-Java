package Pattern_Printing.Pattern;

/*Q1 Print
 *  *****
 *  *****
 *  *****
 *  *****
 */

public class Pattern1 {
    public static void main(String args[]){
        int m,n;
        m=4;
        n=5;
        for(int i=1; i<=m;i++){
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
