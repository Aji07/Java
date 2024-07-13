import java.io.*;
import java.util.*;

class Matproblem {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T VAlue");
        int t = sc.nextInt();
        while ( t-- > 0) {
            System.out.println("Enter");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            MatSolution ob = new MatSolution();
            System.out.println(ob.maxSquare(n, m, mat));
        }
    }
}

class MatSolution {
    static int maxSquare(int n , int m, int mat[][]) {
        int dp[][] = new int[n][m]; 
        int maxsize = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 0; j++){
                if(mat[i][j] == 1){
                    if (mat[i][j] == 1) {
                        if (i == 0 || j == 0) {
                            dp[i][j] = 1;
                        } else {
                            dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                        }
                    }
                    maxsize = Math.max(maxsize, dp[i][j]);
                }
            }
        }

        return maxsize;
    }
    
}