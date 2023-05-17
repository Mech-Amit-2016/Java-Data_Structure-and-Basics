
package oops.exception;

import java.util.Scanner;

public class ExceptionDemo1 {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a and b.i will give u a/b");
        int a=s.nextInt();
        int b=s.nextInt();
        int result=a/b;
        System.err.println(result);
        System.out.println("thanks for using");
    }
}
