/**
 * delete the duplicate keys in the whitelist after the sort
 */

/**
 * binarysearch tree
 */

public class P29 {
    /* count for the frequency of the keys*/
    
    public static int count(int a, int b) {
        return b - a + 1;
    }

    public static int countFront(int key, int[] a) {
        int count = 0;
        int mid = rank(key, a);
        for(int key1 = mid - 1; key1 >= 0; key1--) {
            if (a[key1] == a[key1 + 1]) {
                count++;
            } else {
                break;
            }
        }
        return key1 + 1;
    }

    public static int countAfter(int key, int[] a) {
        int count = 0;
        int mid = rank(key, a);
        for(int key2 = key + 1; key2 < a.length; key2++) {
            if (a[key2] == a[key2 - 1]) {
                count++;
            } else {
                break;
            }
        }
        return key2 - 1;
    }



    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid  + 1;
            } else {
                int firstKey = countFront(mid, a);
                int LastKey = countFront(mid, a);
                return LastKey - firstKey + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,10,10,10,12,13,14,15,16};
        int key = 10;
        int findRes = rank(key, array);
        System.out.println(findRes);
    }
}
