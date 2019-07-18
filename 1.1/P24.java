/**
 * gcb with recursion
 */

public class P24 {

    public static int gcb(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcb(b, a % b);
        }
    }

    public static void main(String args[]) {
        int a = 60, b = 40;
        int result = gcb(a, b);
        System.out.println(result);
    }
}