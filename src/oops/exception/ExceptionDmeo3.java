
package oops.exception;

public class ExceptionDmeo3 {
    public static void main(String[] args) {
        try
        {
         int n=0;   
         n=n/n;
         int [] a={};
         a[5]=10;
        }
        catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
        catch(Exception ex)
        {
            System.err.println("Unknown Exception");
        }
        System.err.println("thanks for using");
    }

}
