package sorting;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        int[] c = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                c[k] = a[i];
                i++;
                k++;

            } else {
                c[k] = a[j];
                j++;
                k++;

            }
        }
        if (i <= mid) {
            for (; i <= mid; i++) {
                c[k] = a[i];
                k++;
            }
        } else {
            for (; j <= right; j++) {
                c[k] = a[j];
                k++;
            }
        }

        for (i = 0; i <= c.length - 1; i++) {
            a[left + i] = c[i];
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 67, 36, 78, 23};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
