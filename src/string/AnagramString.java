
package string;

public class AnagramString {
    public static void main(String[] args) {
        String s1="worht";
        String s2="throw";
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;}
        int n=s1.length()-1;
         for(int i=0;i<=n;i++){
             if(s1.charAt(i)!=s2.charAt(n-i)){
                 System.out.println("not anagram");
                 return;}
            }
          System.out.println("Anagram");
      }
}
