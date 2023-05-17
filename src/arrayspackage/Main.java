
package arrayspackage;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		int []arr={4,5,4,1,3,7,6,3,3};
	
 		 // code here
        int min_sum=0;
       HashSet<Integer> set=new HashSet<>();
       for(int x:arr)
       set.add(x);
       while(true){
           int a= set.iterator().next();
             set.remove(a);
           int b= set.iterator().next();
           set.remove(b);
           min_sum=min_sum+a+b;
           if(set.isEmpty()){
            System.out.println(min_sum);
           return; }
           set.add((a+b));
       System.out.println(set);}
          
	}
}
