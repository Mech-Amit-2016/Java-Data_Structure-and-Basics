package arithmetic;

import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter p,r and t");
        int p = s.nextInt(), r = s.nextInt(), t = s.nextInt();
        double si = (p * r * t) / 100.0;
        System.out.println("SI = " + si);
        double ci = p * Math.pow(1 + r / 100.0, t) - p;
        // p*(1+r/100)^t -p  Math.pow(x,y) 
        System.out.println("CI = " + ci);
    }

}
