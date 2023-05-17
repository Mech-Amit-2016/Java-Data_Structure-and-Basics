
package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={4,68,1,0,18,85,23,45,9,97,10,21};
     System.out.println(Arrays.toString(a));
     for(int j=0;j<=a.length-2;j++)
     {
        for(int i=0;i<=a.length-2-j;i++)
        {
            if(a[i]>a[i+1])
            {
//                System.out.printf("%s>%s\n",a[i],a[i+1]);
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
            }
        }
     }
        System.out.println(Arrays.toString(a));
    }

}
