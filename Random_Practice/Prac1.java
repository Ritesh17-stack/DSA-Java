package Random_Practice;

public class Prac1 {


    static long sumOfDivisors(int N) {
      long sum = 0;
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= i; j++) {
          if (i % j == 0) {
            sum = sum + j;
          }
        }
      }
      return sum;
    }
    public static void main(String[] args) {
      int n = 4;
      System.out.println(sumOfDivisors(n));
    }
}
