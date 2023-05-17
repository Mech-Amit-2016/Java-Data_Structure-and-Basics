
package loops.forloop;

public class Palindrome {
    public static void main(String[] args) {
        int n=1331;
        int copy=n;
        int rev=0;
       while(n>0)
       {
           int rem=n%10;
          rev=rev*10 + rem;
          n=n/10;
       
       }
        System.out.println(rev);
       if(copy==rev)
           System.out.println("palindrome");
    }
}
      