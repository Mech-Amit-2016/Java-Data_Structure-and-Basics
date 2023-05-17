
package arrayspackage;
import java.util.Stack;
public class Aesteriod {
    public static void main(String[] args) {
        int []a={2,5,-8,1,9}; 
        Stack stack=new Stack();
        stack.push(a[0]);
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>0 && (Integer)stack.peek()<0){
                remove(stack,a[i]);
            }
            else{
                stack.push(a[i]);
            }
        }
        System.out.println(stack);
    }
   public static void remove(Stack stack,Integer x){
       int y=Math.max(Math.abs(x), Math.abs((Integer)stack.peek()));
        stack.pop();
        stack.push(y);
    }
}
