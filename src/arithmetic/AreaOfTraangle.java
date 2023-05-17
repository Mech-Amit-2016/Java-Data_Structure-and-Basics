
package arithmetic;
import java.util.Scanner;

public class AreaOfTraangle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Eneter a,b,c");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        double p=(a+b+c)/2.0;
        System.out.println(p);
        double ar=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(ar);
    }

}
