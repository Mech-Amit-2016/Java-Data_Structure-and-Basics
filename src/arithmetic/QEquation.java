
package arithmetic;
import java.util.Scanner;

public class QEquation {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a,b and c");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        double  d=b*b-4*a*c;
        if(d<0)
        {
            System.out.println("imaginery root");
        }
        else
        {
       d=Math.sqrt(d);
        double x1=(-b+d)/(2.0*a);
        double x2=(-b-d)/(2.0*a);
        System.out.println("roots are"+x1+" "+x2);
    }
    }

}
