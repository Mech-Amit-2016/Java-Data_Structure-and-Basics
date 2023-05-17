
package loops.forloop;
import java.util.Scanner;

public class DecimalDemo {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in); 
//        int n=0xf;
//        int n=s.nextInt(16);
        
//          int n=65402; 
//        double n1=0;
//        int x=0;
////        octal to Decimal
//       for(int i=0;n>0;i++)
//       {
//           x=n%10;
//           n1=n1+x*Math.pow(8,i);
//           n=n/10;     
//       }
//       System.out.println(n1);
       //binary to Decimal
//       System.out.println("enter the hexaDecimal no");
//       int y=s.nextInt(16);
      int y=010;
       double n2=0;
       for(int i=0;y>0;i++)
       {
           n2=n2+(y%8)*Math.pow(8,i);
           y=y/8;
       }
       System.out.println(n2);
    }
}
