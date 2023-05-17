
package arithmetic;
import java.util.Scanner;

public class DiagonalOfRec {
    public static void main(String[] args)
    {
        System.out.println("Eneter length and width");
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        double d=Math.sqrt(l*l+b*b);
        System.out.println(d);
    }

}
