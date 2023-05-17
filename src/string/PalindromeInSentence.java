
package string;

public class PalindromeInSentence {
    public static void main(String[] args) {
        String s="madam is a malayalam";
        String []string=s.split(" ");
        for(String s1:string){
            int i=0;
            for(;i<s1.length()/2;i++){
                if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
                    break;
            }
             if(i==s1.length()/2)
                    System.out.println(s1);
        }
    }
}
