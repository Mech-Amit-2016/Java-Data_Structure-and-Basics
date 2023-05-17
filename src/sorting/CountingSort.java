package sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 1, 4, 4, 6, 5, 9, 8, 7};
        System.out.println(Arrays.toString(a));
        int[] frequencies = new int[10];
        for (int x : a) {
            frequencies[x]++;
        }
        System.out.println(Arrays.toString(frequencies));
        for (int i = 1; i <= frequencies.length - 1; i++) {
            frequencies[i] += frequencies[i - 1];
        }
        System.out.println(Arrays.toString(frequencies));
        int output[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int value = a[i];
            int pos = frequencies[value];
            output[pos - 1] = value;
            frequencies[value]--;
        }
        System.out.println(Arrays.toString(frequencies));
        System.out.println(Arrays.toString(output));
    }
}
