
package loops.forloop;
import java.util.ArrayList;

public class SubSetSum {
    public static void main(String[] args) {
        int a[]={6,9,1,5,4,3};
        ArrayList<Integer> subset=new ArrayList<>();
        solution(a,subset,0);
    }
static void solution(int a[],ArrayList<Integer> subset,int i){
    if(i==6){
        int sum=0;
        for(Integer k:subset)
        {
            sum=sum+k;
        }
        if(sum==9)
            System.out.println(subset);
        return;
    }
    subset.add(a[i]);
    solution(a,subset,i+1);
    subset.remove(new Integer(a[i]));
    
    solution(a,subset,i+1);
  }
}
