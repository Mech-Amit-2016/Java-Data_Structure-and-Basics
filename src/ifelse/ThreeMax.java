package ifelse;

public class ThreeMax {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 39;
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}
