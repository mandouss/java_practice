/**
 * delete the duplicate keys in the whitelist after the sort
 */

/**
 * binarysearch tree
 */

public class P29 {
    

    public static int countFront(int mid, int[] a) {
        int mid1 = mid - 1;
        while(mid1 >= 0 && a[mid1] == a[mid1 + 1]) { //guarantee the index not to overflow
            mid1--;
        }
        return mid1 + 1;
    }

    /* count for the frequency of the keys*/
    public static int count(int midFirst, int[] a) {
        if (midFirst == -1) {
            return 0;
        } else {
            int count = 1;
            int mid2 = midFirst;
            while(mid2 < a.length - 1 && a[mid2] == a[mid2 + 1]) { //guarantee the index not to overflow
                count++;
                mid2++;
            }
            return count;
        }
    }

    //find the index of the key
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int firstKey = - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid  + 1;
            } else {
                //return the number of the elements that are smaller than the key
                firstKey = countFront(mid, a); 
                return firstKey;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,10,10,10};
        int key = 10;
        int findFirst = rank(key, array);
        System.out.println(findFirst + "\n");
        int findAll = count(findFirst, array);
        System.out.print(findAll);
    }
}
