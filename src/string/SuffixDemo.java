
package string;

public class SuffixDemo {
    public static void main(String[] args) {
        String []s={"best","nicest","surest"};
        String suffix="";
        int n=s.length;
        int n1=s[0].length();
        for(int i=n1-1;i>=0;i--){
            suffix=s[0].substring(i, n1);
            for(int j=1;j<=s.length-1;j++){
                if(s[j].endsWith(suffix));
                else{
                    System.out.println(s[0].substring(i+1,n1));
                    return;
                }
            }
        }
        System.out.println(suffix);
    }
}
