
package arrayspackage;
import java.util.Scanner;

public class countElement {
    public static void main(String[] args) {
        int a[]={3,4,6,8,9,9,10,15,3,67,0,0,9};
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
                count++;
        }
        if(count==0)
            System.out.println("not found");
        else
            System.out.println(n+" found "+count+" times");
            }
}
