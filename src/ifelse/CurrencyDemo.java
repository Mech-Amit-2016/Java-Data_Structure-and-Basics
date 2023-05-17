
package ifelse;
import java.util.Scanner;

public class CurrencyDemo {
public static void main(String[] args)
{
    System.out.println("enter rupees and paisa");
    Scanner s=new Scanner(System.in);
    int rs=s.nextInt();
    int ps=s.nextInt();
        System.out.println("rs="+(rs+ps/100)+"ps="+ps%100);
}
}
