
package loops.whileloop;

public class NumToStr {
      public static void main(String[] args) {
        int n=123;
        String output="";
        while(n>0)
        {
            switch(n%10)
            {
                case 0:
                    output=" zero"+output;
                    break;
                case 1:
                    output=" one"+output;
                    break;
                case 2:
                    output=" two"+output;
                    break;
                case 3:
                    output=" three"+output;
                    break;
                case 4:
                    output=" four"+output;
                    break;
                case 5:
                    output=" five"+output;
                    break;
                case 6:
                    output=" six"+output;
                    break;
                 case 7:
                    output=" seven"+output;
                    break;
                 case 8:
                    output=" eight"+output;
                    break;
                 case 9:
                    output=" "+output;
                    break;
                 default :
                     System.out.println("invalid");
            }
           n=n/10; 
        }
         System.out.println(output);   
    }
}
