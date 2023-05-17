package arrayspackage;

public class SubSequencSearch {

    public static void main(String[] args) {
        int a[] = {1, 4, 7,3, 9, 10, 14,4,7,3,4,7,3,4,9,0,7,4,7,4,7,3};
        int b[] = {4,7,3};
        int count=0;
        counter:
        for (int i = 0; i <= a.length - b.length; i++) {
            if (a[i] == b[0]) {
                for (int j = 1; j <= b.length - 1; j++) {
                    if (a[i + j] != b[j]) {
                        continue counter;
                    }
                }
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Count " + count);
    }

}
