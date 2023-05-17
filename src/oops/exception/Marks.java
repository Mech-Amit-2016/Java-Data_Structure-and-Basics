
package oops.exception;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Marks {
    public static int getMarks(String message){
        Scanner scanner=new Scanner(System.in);
        while(true){
            try{ 
                System.err.println(message);
                int n=Integer.parseInt(scanner.nextLine());
                if(n<0 || n>100){
                    throw new Exception("invalid Marks");
                }
                return n;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                scanner.reset();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(getMarks("Enter marks in Physics"));
    }
}
