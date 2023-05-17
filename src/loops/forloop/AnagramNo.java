
package loops.forloop;
import java.util.ArrayList;

public class AnagramNo {
    public static void main(String[] args) {
        int n1=145;
        int n2=65146;
        ArrayList<Integer> a=new ArrayList<>();
        while(n1>0)
        {
            a.add(n1%10);
            n1=n1/10;
        }
        System.out.println(a);
        while(n2>0)
        {
            int rem=n2%10;
            if(!a.contains(rem))
            {
                System.out.println("Not Anagram");
                return;
            }
            a.remove(new Integer(rem));
            n2=n2/10;
        }
        System.out.println(a);
        if(a.isEmpty())
            System.out.println("loops.forloop.AnagramNo.main()");
    }

}
