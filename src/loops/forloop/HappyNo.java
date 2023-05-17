package loops.forloop;

import java.util.ArrayList;

public class HappyNo {

    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> a = new ArrayList<>();
        while (true) {
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            if (sum == 1) {
                System.out.println("Happy no");
                break;
            }
            if (a.contains(sum)) {
                System.out.println("Not happy no");
                break;

            }
            a.add(sum);
            n = sum;
        }
        System.out.println(a);
    }

}
