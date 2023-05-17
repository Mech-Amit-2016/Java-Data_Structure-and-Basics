package sorting;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {23, 41, 56, 2, 1, 89};
        for (int i = 0; i <= a.length-2; i++) {
            int minpos = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[minpos]) {
                    minpos = j;
                }
            }
            int t = a[minpos];
            a[minpos] = a[i];
            a[i] = t;
            
        }
        System.out.println(Arrays.toString(a));
    }
}
