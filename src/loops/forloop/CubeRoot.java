
package loops.forloop;

public class CubeRoot {
    public static void main(String[] args) {
//        double n=27;
//        double x1=2;
//        double x2=n/(x1*x1);
//        double error=.0001;
//        while(Math.abs(x1-x2)>error)
//        {
//            x1=(x1+x2)/2;
//            x2=n/(x1*x1);
//            
//        }
//        System.out.println(x1 );
        double n=625;
        double x1=1;
        double x2=n/(x1*x1*x1);
        double error=.0001;
        while(Math.abs(x1-x2)>error)
        {
            x1=(x1+x2+x1)/3;
            x2=n/(x1*x1*x1);
            
        }
        System.out.println(x1 );
    }
}
