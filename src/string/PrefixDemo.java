
package string;

public class PrefixDemo {
    public static void main(String[] args) {
        String []s={"Andies","Andaman","Andora"};
        String prefix="";
        for(int i=0;i<=s[0].length()-1;i++){
             prefix=s[0].substring(0,i+1);
            for(int j=1;j<=s.length-1;j++){
                if(s[j].startsWith(prefix));
                else {
                    System.out.println(s[0].substring(0, i));
                    return;
                }
            }
        }
        System.out.println(prefix);
    }
}
