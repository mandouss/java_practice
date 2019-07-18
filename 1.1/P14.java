/**
 *  1.14
 */

public class P14 {
    private static int lg(int N) {
        int x = -1;
        float product = 1;
        while(product <= N) {
            product = product * 2;
            x++;
        }
        return x;
    }

    public static void main(String arg[]) {
        int N = 1;
        System.out.println(lg(N)); 
    }
}