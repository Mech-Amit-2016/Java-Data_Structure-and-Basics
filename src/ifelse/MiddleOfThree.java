
package ifelse;

public class MiddleOfThree {
    public static void main(String[] args)
    {
        int a=6,b=6,c=-5,mid;
        
        if(a>=b && a<=c || a>=c && a<=b)
    mid=a;
        else if(b>=a && b<=c || b>=c && b<=a)
            mid=b;
        else 
            mid=c;
        System.out.println("mid is"+mid);
    }
}
