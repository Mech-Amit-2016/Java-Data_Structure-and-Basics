
package string;

public class CharArrayToInt {
    public static void main(String[] args) {
        char[]ch={'1','2','3','4'};
        int n=0;
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9')
                n=10*n+ch[i]-48;
            else{
                System.out.println("can not convert");
                return;
              }
           }
        System.out.println(n);
        }    
     }
