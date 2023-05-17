package loops.forloop;

public class ForLoopTypes {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        int x = 1;
        for (; x <= 3; x++) {
            System.out.println(x);
        }
        for (;; x++) {
            if (x > 3) {
                break;
            } else {
                System.out.println(x);
            }
        }

        for (;;) {
            if (x > 3) {
                break;
            } else {
                System.out.println(x++);
            }
        }

        for (int i = 1, j = 10; i <= j; i++, j--) {
            System.out.println(i + "," + j);
        }
        for (int i = 1, j = 10; i <= j; i++, j--, System.out.println(i + "," + j))
            ;
        for (;;)
            ;
    }
}
