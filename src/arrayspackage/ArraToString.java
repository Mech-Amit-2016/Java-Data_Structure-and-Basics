
package arrayspackage;
import java.util.Stack;

public class ArraToString {
  String s="3[a[2b[2c[d]]]]";
  Stack s1=new Stack();
  Stack s2=new Stack();
  public static void main(String args[]){
      String s="3[a[2b[2c[d]]]]";
  Stack s1=new Stack();
  Stack s2=new Stack();
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)>='0' && s.charAt(i)<='9'){
        s1.push(s.charAt(i));
         continue;}
    if(s.charAt(i)=='[' || s.charAt(i)==']')
        continue;
       else
        s2.push(s.charAt(i));
   }
      System.out.println(s1);
      System.out.println(s2);
  }
}
