package Stack;
import java.util.Stack;
import java.util.Arrays;
// Q: https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class TwoStacks {
    public static int twoStack(int[] a,int[] b,int maxSum){
        return twoStack(a,b,0,0,maxSum)-1;
    }
    private static int twoStack(int[] a, int[] b, int sum , int count,int maxSum){
        if(sum>maxSum){
            return count;
        }
        if (a.length==0||b.length==0) {
            return count;
        }
        int ans1 = twoStack(Arrays.copyOfRange(a,1,a.length), b, sum + a[0],count+1,maxSum);
        int ans2 = twoStack(a,Arrays.copyOfRange(b, 1, b.length), sum+b[0],count+1,maxSum);
        return Math.max(ans1, ans2);
    }
    public static void main(String[] args) {
        int a[]= {4, 2, 4, 6, 1};
        int b[]= {2,1,8,5};
        int score = twoStack(a, b, 10);
        System.out.println(score);        
    }
}
