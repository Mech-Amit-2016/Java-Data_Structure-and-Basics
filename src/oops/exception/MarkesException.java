
package oops.exception;
import java.util.Scanner;
import java.lang.Exception;

public class MarkesException {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        try{
        if(marks<0 || marks>100)
            throw new Exception();  
        }
        catch(Exception ex)
                {
                  System.out.println("out of range");
                }
        System.out.println("thanks for using");
         }
}
