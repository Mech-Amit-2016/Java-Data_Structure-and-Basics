
package sorting;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,9};
        int b[]={1,2,5,7,9};
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(k<=a.length+b.length-1)
        {
            if( i<=a.length-1 && a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            continue;}
          
            c[k]=b[j];
            j++;
            k++;

        }
        System.out.println(Arrays.toString(c));
    }
}
