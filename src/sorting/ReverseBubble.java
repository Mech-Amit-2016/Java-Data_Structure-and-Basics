
package sorting;

import java.util.Arrays;

public class ReverseBubble {
    public static void main(String[] args) {
       int a[]={4,68,1,0,18,85,23,45,9,97,10,21};
       System.out.println(Arrays.toString(a));
       for(int i=a.length-2;i>=0;i--){
           for(int j=0;j<=i;j++){
               if(a[j]>a[j+1]){
                   int t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;
               }
           }
       }
       System.out.println(Arrays.toString(a));
    }

}
