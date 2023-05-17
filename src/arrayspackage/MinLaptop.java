package arrayspackage;

public class MinLaptop {

    public static void main(String[] args) {
        int a[] = {1, 2, 4,5};
        int b[] = {2, 3, 6,6};
        int N = a.length;
        System.out.println(minLaptops(N, a, b));
    }

    public static int minLaptops(int N, int[] a, int[] b) {
        int maxCount = 0;
        for (int t = 1; t <= b[2]; t++) {
            int count = 0;
            for (int i = 0; i <= a.length - 1; i++) {
                if (t <= a[i]) {
                    break;
                } else {
                    if (a[i] < t && t <= b[i]) {
                        count++;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

}
