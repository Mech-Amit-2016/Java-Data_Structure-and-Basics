
package ifelse.switchpackage;
import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args)
    {
        System.out.println("enter the pecentage marks");
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        switch(marks/10)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                
              System.out.println("failed");
              break;
            case 4:
                    System.out.println("third");
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                    System.out.println("second");
                default:
                    System.out.println("first");
                break;
            
           
        }
    }

}
