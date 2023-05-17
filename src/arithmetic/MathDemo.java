
package arithmetic;
import java.util.Scanner;
public class MathDemo {
public static void main(String[] args)
{
    System.out.println("enter circumference");
    Scanner s=new Scanner(System.in);
     double c=s.nextDouble();
     double r=(c*7)/(2*22);
     double a=(22/7)*r*r;
     System.out.println(a);
}
}
