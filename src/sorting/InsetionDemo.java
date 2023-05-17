
package sorting;

import java.util.Arrays;

public class InsetionDemo {
    public static void main(String[] args) {
        int a[]={4,6,34,89,21,0,45,68,78,20,1};
        for(int i=0;i<a.length-1;i++){
               if(a[i]>a[i+1]){
                   int k=a[i+1];
                   int j=i;
                   while(a[j]>k && j>=0){
                       a[j+1]=a[j];
                       j--;
                       }
                   a[j+1]=k;
                  }
            }
        System.out.println(Arrays.toString(a));
    }
}
