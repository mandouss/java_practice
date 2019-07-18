/**
 * computes the value of ln(N!)
 */

import java.lang.Math;

public class P20 {
    
    private static double reverseFactorial(int N) {
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 0;
        } else {
            return reverseFactorial(N - 1) + Math.log(N);
        }
    }

    public static void main(String args[]) {
        int N = 5;
        double result = reverseFactorial(N);
        System.out.println(result);
    }
}