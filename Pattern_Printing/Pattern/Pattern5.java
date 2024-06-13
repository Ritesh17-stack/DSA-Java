package Pattern_Printing.Pattern;
/*Q5 Print
   *
  **
 ***
****
*/
public class Pattern5{
    public static void main(String args[]){
        int n=4;
        //for rows
        for (int i = 1; i <=n; i++) {
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
