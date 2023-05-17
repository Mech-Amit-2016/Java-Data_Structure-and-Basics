
package arrayspackage;
import java.util.Scanner;

public class SumArray {
    public static void main(String []args)
    {
        int a[]={5,7,12,4,10,90};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of array element is "+sum);
    }

}
