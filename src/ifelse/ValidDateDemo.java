
package ifelse;
import java.util.Scanner;

public class ValidDateDemo {
    public static void main(String[] args)
    {
        System.out.println("enter day,month and year");
        Scanner s=new Scanner(System.in);
        int day=s.nextInt();
        int mnt=s.nextInt();
        int yr=s.nextInt();
        
        switch(mnt)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day>=1 && day<=31)
                    System.out.println("valid ");
                else 
                    System.out.println("invalid");
                break;
            case 2:
                if((yr%400==0) || (yr%4==0 && yr%100!=100))
                {
                    if(day>=1 && day<=29)
                        System.out.println("valid");
                    else
                        System.out.println("invalid");
                }
                else
                {
                    if(day>=1 && day<=28)
                        System.out.println("valid");
                    else
                        System.out.println("invalid");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day>=1 && day<=30)
                   System.out.println("valid");
                else
                    System.out.println("invalid");
            default :
                System.out.println("invalid");
                    
        }
        
    }

}
