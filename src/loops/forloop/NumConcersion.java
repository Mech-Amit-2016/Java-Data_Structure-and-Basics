
package loops.forloop;

public class NumConcersion {
      public static void main(String[] args) {
        int n=16;
        String output="";
        //Decimal to binary
//         while(n>0)
//         {
//             output=n%2+output;
//             n=n/2;
//         }
//         System.out.println(output);
      while(n>0)
      {
         output=n%8+output; 
         n=n/8;
      }
      System.out.println(output);
     }
}
 
