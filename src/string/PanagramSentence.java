
package string;

public class PanagramSentence {
    public static void main(String[] args) {
        String s="a quick brown fox jumps over the lazy dog";
         s=s.replace(" ","");
        int frequency[]=new int[26];
        for(int i=0;i<s.length();i++)
            frequency[(int)s.charAt(i)-97]++;
        int i=0;
    for(;i<frequency.length;i++){
        if(frequency[i]==0){
            System.out.println("not panagram");
            return;
        }
      }
    if(i==frequency.length)
        System.out.println("panagram");
    } 
}
