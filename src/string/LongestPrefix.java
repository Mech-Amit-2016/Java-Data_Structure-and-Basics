
package string;

public class LongestPrefix {
    public static void main(String[] args) {
        String []s={"ando","andoaman","andora"};
        String result="";
        String min=s[0];
        for(int i=0;i<s.length-1;i++){
            if(min.length()>s[i].length())
                min=s[i+1];
        }
        System.out.println(min);
       for(int i=0;i<min.length();i++){
           for(int j=0;j<s.length-1;j++){
               if(s[j].charAt(i)==s[j+1].charAt(i));
               else{
                   System.out.println("longedt prefix is "+result);
                   return;}
               }
           result=min.substring(0, i+1);
           }
       System.out.println(result);
       }        
}
