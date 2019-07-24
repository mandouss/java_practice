/**
 * exercise 30 
 */

public class P30 {

    public static int gcb(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcb(b, a % b);
        }
    }

    public static boolean[][] booleanTransfer(int[][] array) {
        boolean[][] arrayResult = new boolean[array.length][array[0].length];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int gcbResult = gcb(i, j);
                if (gcbResult == 1) {
                    arrayResult[i][j] = true;
                } else {
                    arrayResult[i][j] = false;
                }
            }
        }
        return arrayResult;
    }

    public static void main(String args[]) {
        int[][] array = new int[20][20];
        boolean[][] booleanArray = booleanTransfer(array);
        for(int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray[i].length; j++) {
                System.out.print(booleanArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}