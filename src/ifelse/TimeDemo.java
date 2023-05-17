
package ifelse;
import java.util.Scanner;

public class TimeDemo {
 public static void main(String[] args)
 {
     System.out.println("enter hr and minute");
   Scanner s=new Scanner(System.in);
   int hr=s.nextInt();
   int min=s.nextInt(); 
   if(hr<=11)
         System.out.println( hr + ":" + min + " AM");
   else
       if(hr==12)
           System.out.println( hr + ":" + min + " PM");
   else
           System.out.println( (hr-12) + ":" + min + " PM");
           
 }
}
