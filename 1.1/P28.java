/**
 * delete the duplicate keys in the whitelist after the sort
 */

 public class P28 {

    public static int remoteDuplicateKeys(int[] a) {
        int j = 0;
        for(int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {
                a[j+1] = a[i];
                j++;
            }
        }
        return j;
    }

     public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 8, 9, 10};
        int index = remoteDuplicateKeys(arr);
        for (int i = 0; i <= index; i++) {
            System.out.println(arr[i]);
        }
     }
 }

