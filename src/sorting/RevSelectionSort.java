package sorting;

import java.util.Arrays;

public class RevSelectionSort {

    public static void main(String[] args) {
        int a[] = {4, 66, 90, 101, 3, 2, 79};
        for (int i = a.length - 1; i > 0; i--) {
            int maxpos = i;
            for (int j = i-1; j >= 0; j--) {
                if (a[j] > a[maxpos]) {
                    maxpos = j;
                }
            }
            int t = a[maxpos];
            a[maxpos] = a[i];
            a[i] = t;
        }
        System.out.println(Arrays.toString(a));
    }

}
