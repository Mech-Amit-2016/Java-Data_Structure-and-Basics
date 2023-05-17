package sorting;

import java.util.Arrays;

public class BubbleDemo {

    public static void main(String[] args) {
        int a[] = {3, 56, 7, 3, 78, 90, 0, 6};
        for (int j = 0; j <= a.length - 2; j++)
        {
            for (int i = 0; i<= a.length - 2 - j; i++)
            {
                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
