
package ifelse;
import java.util.Scanner;

public class LeapYear {
public static void main(String[] args){
    System.out.println("enter the year value");
    Scanner s=new Scanner(System.in);
    int yr=s.nextInt();
        if( yr%400==0)
            System.out.println("leap year");
        else if(yr%4==0 && yr%100!=0)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
}
}
