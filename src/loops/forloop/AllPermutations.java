
package loops.forloop;
import java.util.ArrayList;

public class AllPermutations {
    public static void main(String[] args) {
        int n=123;
        int n2=n;
        ArrayList<Integer> a=new ArrayList<>();
        int count=0;
        while(n>0)
        {
            count++;
           int rem=n%10;
           a.add(rem);
           n=n/10;
        }
        int min=a.get(0);
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)<min);
            min=a.get(i);
        }
         for(int copy=min,copy1=copy;;copy++,copy1=copy)
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
           if(copy1==0 && count1<=count){
               System.out.println(copy);
             }
           if(count1>count){
           break;}
        }
    }

}
