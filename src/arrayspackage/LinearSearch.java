package arrayspackage;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {2, 1, 44, 5, 67};
        System.out.println("enter a number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                System.out.println("Found at " + i);
                return;
            }
        }
        System.out.println("Not found");

    }

}
