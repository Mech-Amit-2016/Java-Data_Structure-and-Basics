
package loops.forloop;
public class PowerOfNum {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        int result=1;
        //calculating 3^4
        for(int i=1;i<=y;i++)
            result=result*x;
        System.out.println(result);
    }
}
