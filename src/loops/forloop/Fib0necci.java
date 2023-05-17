
package loops.forloop;

public class Fib0necci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34;
        for(int i=0,j=1,k;i<=34;k=i+j,i=j,j=k)
            System.out.println(i);
    }
}
