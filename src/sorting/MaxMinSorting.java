
package sorting;

import java.util.Arrays;

public class MaxMinSorting {
    public static void main(String[] args) {
        int []a={2,6,78,6,12,100,23};
        for(int i=0;i<a.length-2;i++)
        {
           int mark=i;
            for(int j=i+1; j<=a.length-1; j++)
            {
                if(i%2!=0){
                    if(a[i]<a[j])
                       mark=j;
                continue;}
                if(a[i]>a[j])
                    mark=j;       
            }
            int t=a[mark];
               a[mark]=a[i];
               a[i]=t;
        }
        System.out.println(Arrays.toString(a));
    }   

}
