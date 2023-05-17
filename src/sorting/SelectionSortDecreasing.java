
package sorting;

import java.util.Arrays;

public class SelectionSortDecreasing {
    public static void main(String[] args) {
        int a[]={3,45,9,89,0,14,97};
        for(int i=0;i<=a.length-2;i++)
        {
            int maxpos=i;
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[j]>a[maxpos])
                    maxpos=j;
            }
            int t=a[maxpos];
            a[maxpos]=a[i];
            a[i]=t;
        }
        System.out.println(Arrays.toString(a));
    }

}
