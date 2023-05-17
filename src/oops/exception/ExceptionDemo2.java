
package oops.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try
        {
            int n=10;
            n=n/n;
            int []a={};
            a[5]=10;
        }
        catch(NullPointerException ex)
        {
            System.out.println("found a null value");
            
        }
        catch(ArithmeticException ex)
        {
            System.err.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.err.println("Array Index out of Bound Exception");
        }
        catch(Exception ex)
        {
            System.err.println("Unknown Exception");
        }
        System.out.println("thanks for using");
    }
}
