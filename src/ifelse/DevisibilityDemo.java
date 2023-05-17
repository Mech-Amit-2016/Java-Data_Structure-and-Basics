
package ifelse;
import java.util.Scanner;

public class DevisibilityDemo {
  public static void main(String[] args)
  {
      System.out.println("enter the numbers for divisibility");
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      
           if(x%y==0)
               System.out.println("divisible");
           else
               System.out.println("not Divisible");
      }           
               
  }

