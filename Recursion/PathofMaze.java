package Recursion;

// Count the path in a maze to move from (0,0) to (n,m)
// Movement possible - Right , downwards
public class PathofMaze {

  public static int countPath(int i, int j, int n, int m) {
    // The code is not working when n>m 
    if (i==n-1 && j==m-1) {
        return 1;
    }
    if (i==n || j==n) {
        return 0;
    }
    // For downward
    int downpath = countPath(i + 1, j, n, m);
    // For upward
    int rightpath= countPath(i, j + 1, n, m);
    // return total paths
    return downpath+rightpath;
  }

  public static void main(String[] args) {
    int n = 51;
    int m = 9;
    int no_of_paths =countPath(0, 0, n, m);
    System.out.println(no_of_paths);
  }
}
