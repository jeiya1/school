package searching;

public class Binary {
    public static int binsearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r){
            int m = (l + r) / 2;
            int found = arr[m];
            if (found == value) {
                return m;
            }
            else if (found > value) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }
}
