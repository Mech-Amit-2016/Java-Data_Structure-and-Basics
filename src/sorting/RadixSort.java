package sorting;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int a[] = {335, 205, 193, 391, 25};

        countSort(a);

        System.out.println(Arrays.toString(a));
    }

    static int getDigit(int n, int pos) {
        int multiplier = 1;
        for (int i = 1; i <= pos - 1; i++) {
            multiplier *= 10;
        }
        n = n / multiplier;
        return n % 10;
    }

    static void countSort(int a[]) {

        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int maxDigit = 0;
        while (max > 0) {
            max = max / 10;
            maxDigit++;
        }
        int j = 1;
        while (j <= maxDigit) {
            int frequencies[] = new int[10];
            int a1[]=new int[a.length];
            for (int i = 0; i <= a.length - 1; i++) {
                a1[i]=getDigit(a[i], j);
                  frequencies[getDigit(a[i], j)]++ ;    
            }
            
//            System.out.println(Arrays.toString(frequencies));
            for (int i = 1; i <= frequencies.length-1; i++) {
                frequencies[i] += frequencies[i - 1];
            }
         
//            System.out.println(Arrays.toString(frequencies));
            int output[] = new int[a.length];
            for (int i = a1.length - 1; i >= 0; i--) {
                int value = a1[i];
                int pos = frequencies[value];
                output[pos - 1] = a[i];
                frequencies[value]--;

            }
            for (int i = 0; i <= a.length - 1; i++) {
                a[i] = output[i];}
//                System.out.println(Arrays.toString(a));
            j++;
        }
    }
}
