
package loops.forloop;
import java.util.ArrayList;

public class NextLargest {
    public static void main(String[] args) {
      int n=54123;
      int n2=n;
      int count=0;
      ArrayList<Integer> a=new ArrayList<>();
        while(n>0)
        {
            count++;
            int rem=n%10;
            a.add(rem);
            n=n/10;
        }
        System.out.println(a);
      for(int copy=n2+1,copy1=copy;;copy++,copy1=copy)
        {
           
           ArrayList<Integer> b=new ArrayList<>();
           b.addAll(a);
           int count1=0;
           while(copy1>0)
           {
               count1++;
               int rem=copy1%10;
               if(!b.contains(rem))
               {
                   break;
               }
               b.remove(new Integer(rem));
               copy1=copy1/10;
           }
           if(b.isEmpty() && copy1==0){
               System.out.println(copy);
             break;}
           if(count1>count){
               System.out.println("not possible");
           break;}
        }
    }
}
