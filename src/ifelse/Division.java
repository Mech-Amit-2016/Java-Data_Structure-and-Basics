
package ifelse;
import java.util.Scanner;

public class Division {
    public static void main(String[] args)
    {
        System.out.println("enter percentage");
        Scanner s=new Scanner(System.in);
        double per=s.nextDouble();
        if(per<40)
            System.out.println("Failed");
        else if(per<50)
            System.out.println("3rd Div");
        else if(per<60)
            System.out.println("2nd Div");
        else
            System.out.println("1st Div");
        
    }

}
