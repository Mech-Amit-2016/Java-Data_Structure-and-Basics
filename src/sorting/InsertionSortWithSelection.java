package sorting;

import java.util.Arrays;

public class InsertionSortWithSelection {

    public static void main(String[] args) {
        int a[] = {2, 4, 47, 6, 78, 23};
        System.out.println(Arrays.toString(a));
        //**********************************************
        for (int i = 0; i <= 0; i++) {
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

        //**********************************************
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int k = a[i + 1];
                int j = i;
                while (a[j] > k) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = k;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
