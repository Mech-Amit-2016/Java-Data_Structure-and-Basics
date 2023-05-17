
package oops.exception;

public class ExceptionTryCatch {
    public static void main(String[] args) {
        try{
            int n=0;
                n=n/n;
          }
        catch(Exception ex)
                {
              System.out.println(ex);
                }
        finally{
            System.out.println("oops.exception.ExceptionTryCatch.main()");
        }
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
              }
    
}
