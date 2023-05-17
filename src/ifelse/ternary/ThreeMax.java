package ifelse.ternary;

public class ThreeMax {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 6;
//        int max;
//        if(a>=b)
//            max=a;
//        else
//        max=b;
//        System.out.println(max);
//        int max = (a >= b) ? a : b;
//        System.out.println(max);
//
//        max = (a >= b) ? (a >= c) ? a : c : (b >= c) ? b : c;
//        System.out.println(max);
//        max = (a >= b && a>=c) ?  a :(b >= c) ? b : c;
//        System.out.println(max);
         int min=(a<=b) ? (a<=c) ? a : c :(b<=c)? b : c;
        min=(a<=b && a<=c) ? a : (b<=c) ? b : c;
        System.out.println(min);
    }
}
