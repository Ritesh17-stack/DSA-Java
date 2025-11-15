package Pattern_Printing.Pattern;

public class Practice {
    public static void pat1(int m, int n){
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat2(int m,int n){
        for(int i=0; i<m; i++){
            for(int j = 0; j< n; j++){
                if (i==0 || i == m-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        for(int i =0; i< n ; i++){
            for(int j =0 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        for(int i=n-1;i>0;i--){
            for(int j = 0 ; j< i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    public static void pat5(int n){
        for(int i = 0;i<n;i++){
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void pat6(int n) {
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pat7(int n) {
        for(int i = n; i>= 1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pat8(int n){
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    public static void pat9(int n){
        for(int i = 1 ; i<= n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0)
                System.out.print("1 ");
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void pat10(int n){
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // pat1(5,4);
        // pat2(4,5);
        // pat3(5);
        // pat4(5);
        // pat5(5);
        // pat6(5);
        // pat7(5);
        // pat8(5);
        // pat9(5);
        pat10(5);
    }
    
}