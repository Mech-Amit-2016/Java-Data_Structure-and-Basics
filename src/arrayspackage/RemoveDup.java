package arrayspackage;

import java.util.ArrayList;

public class RemoveDup {

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 2, 2, 3, 4, 5, 5, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[i - 1]) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }
}
