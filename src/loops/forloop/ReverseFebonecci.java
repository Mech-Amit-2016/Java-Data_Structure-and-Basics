 
package loops.forloop;
import java.util.Scanner;

public class ReverseFebonecci {
     public static void main(String[] args) {
        System.out.println("enter the last two no of series");
        Scanner s=new Scanner(System.in);
        int x=34;
        int y=21;
        System.out.println(x);
        System.out.println(y);
        int z=x-y;
        for(;z>0;)
        {
            System.out.println(z);
            x=y;
            y=z;
            z=x-y;        
        }   
        System.out.println(z);
    }
}
