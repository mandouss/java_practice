/**
 * histogram
 */
import java.util.Arrays;

public class P15 {

    private static int[] histogram(int[] arr, int M) {
        int[] hisArr = new int[M];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= M - 1) {
                hisArr[arr[i]] += 1;
            }
        }
        return hisArr;
    }

        public static void main(String args[]) {
        int[] arr = {1,5,3,2,5,7,9,3,9,4,0,2,6,6,4};
        int M = 9;
        System.out.println(Arrays.toString(histogram(arr, M)));
    }
}