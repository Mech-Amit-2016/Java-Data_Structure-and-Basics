
package sorting;
import java.util.Arrays;

public class mergeDemo1 {
    public static void main(String[] args) {
        int a[]={1,4,7,9};
        int b[]={2,3,5,6,8,10};
        int c[]=new int[a.length+b.length-1];
        int i=0,j=0,k=0;
        while(k <=  a.length+b.length-1 && i<= a.length-1 && j<=b.length-1 ){
            if(i<= a.length-1 && j<=b.length-1 && a[i]>b[j]){
                c[k]=b[j];
                k++;
                j++;}
            else
            {
                c[k]=a[i];
                k++;
                i++;
            }
            System.out.println(Arrays.toString(c));
        }
        System.out.println(Arrays.toString(c));
    }

}
