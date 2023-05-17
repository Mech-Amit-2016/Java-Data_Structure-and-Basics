package arrayspackage;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] a = {34, 56, 12, 4, 90, 100, 56, 32, 12, 56, 4};
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (b.contains(a[i])) {
                continue;
            }

            b.add(a[i]);
        }

        System.out.println(b);
    }

}
