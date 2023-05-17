
package loops.forloop;

public class ForLoopDem4 {
    public static void main(String[] args) {
        //2,6,12,20.....90; i=i+j+2
        int i,j;
        for(i=2,j=2;i<=90;j=j+2,i=i+j)
            System.out.println(i);
    }
}
