
package loops.forloop;
import java.util.Scanner;

public class NumberToword {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String output="";
        while(n>0)
        {
            
        switch(n%10)
        {
            case 0:
//                System.out.println("zero");
                output=" Zero " + output;
                break;
            case 1:
 //               System.out.println("one");
                output=" one " + output;
                break;
            case 2:
//                System.out.println("two");
                output=" two " + output;
                break;
            case 3:
//                System.out.println("three");
                output=" three " + output;
                break;
            case 4:
//                System.out.println("four");
                output=" four " + output;
                break;
            case 5:
//                System.out.println("five");
                output=" five " + output;
                break;
            case 6:
//                System.out.println("six");
                output=" six " + output;
                break;
            case 7:
//                System.out.println("seven");
                output=" seven " + output;
                break;
            case 8:
 //               System.out.println("eight");
                output=" eight " + output;
                break;
            case 9:
//                System.out.println("nine");
                output=" nine " + output;
                break;
                default:
                    System.out.println("Invalid");
        }
        n=n/10;
        }
        System.out.println(output);
    }
}
