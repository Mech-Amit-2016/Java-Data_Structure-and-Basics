
package loops.forloop;
import java.util.Scanner;

public class ForLoopTable {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+"*"+i+"="+n*i);
    }
}
