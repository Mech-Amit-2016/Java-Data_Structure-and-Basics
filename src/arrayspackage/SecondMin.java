package arrayspackage;

public class SecondMin {

    public static void main(String[] args) {
        int a[] = {4, 6, 5, 66, 23, 12, 90};
        int min1 = a[0];
        int min2 = a[1];
        if (min1 > min2) {
            int t = min1;
            min1 = min2;
            min2 = t;
        }
        for (int i = 2; i <= a.length - 1; i++) {
            if (a[i] <= min1) {
                min2 = min1;
                min1 = a[i];
                continue;
            }
            if (a[i] < min2) {
                min2 = a[i];
            }
        }

        System.out.println(min1 + "," + min2);
    }

}
