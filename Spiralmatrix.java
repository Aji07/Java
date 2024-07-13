import java.util.*;

public class Spiralmatrix {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int N = sc.nextInt();
        System.out.println("Output: " + printSpiralMatrix(N));
        sc.close();
    }

    public static int printSpiralMatrix(int N) {
        int matrix[][] = new int[N][N];
        int num = N * N;
        int rowstart = 0, rowend = N - 1, colstart = 0, colend = N - 1;
        int output = 0;
        
        return output;
    }
}