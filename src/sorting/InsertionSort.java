package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {2, 4, 47, 6, 78, 23};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int k = a[i + 1];
                int j = i;
                while (a[j] > k && j >= 0) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = k;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
