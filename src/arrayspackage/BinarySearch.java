package arrayspackage;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {1, 4, 7, 8, 9, 10, 13, 14, 17, 20};
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int left = 0;
        int right = a.length - 1;
        int mid = (left + right) / 2;
        while (true) {
            if (left > right) {
                System.out.println("can not be find");
                break;
            }
            if (a[mid] == n) {
                System.out.println("found at " + mid + " position");
                return;
            }

            if (a[mid] > n) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
    }

}
