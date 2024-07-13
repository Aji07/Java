
import java.util.*;
import java.io.*;

class Maxsum {
    public static void main(String[] args) throws IOException{
        int N = 0;
        int M = 0;
        ArrayList<Integer> Arr = new ArrayList<Integer>(N);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        N = sc.nextInt();
        System.out.println("Enter M: ");
        M = sc.nextInt();
        System.out.println("Enter Arr: ");
        for(int i = 0; i < N; i++) {
            Arr.add(sc.nextInt());
        }
        sc.close();
        Solution ob = new Solution();
        System.out.println("Max Sum is : " +  ob.maximumSumSubarray(N, Arr, M));
    }
}

class Solution {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int M) {
        long maxSum = 0;
        long currentSum = 0;

        return maxSum;
    }
}
