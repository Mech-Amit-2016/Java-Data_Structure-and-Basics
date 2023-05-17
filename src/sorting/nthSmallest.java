package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class nthSmallest {
      public static void main(String[] args) {
        int a[]={3,5,23,45,1,0,78};
        System.out.println(Arrays.toString(a));
        int n=3;
        for(int i=0;i<=n-1;i++){
            int minpos=i;
            for(int j=i+1;j<=a.length-1;j++){
                if(a[minpos]>a[j])
                    minpos=j;
            }
            int t=a[minpos];
            a[minpos]=a[i];
            a[i]=t;
        }
        System.out.println(a[n-1]);
    }
}
