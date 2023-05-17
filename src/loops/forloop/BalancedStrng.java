package loops.forloop;

enum Direction {
    Forward, Backward;
}

public class BalancedStrng {

    public static void main(String[] args) {
        int n = 26;
        StringBuilder builder = new StringBuilder();
        if (n % 2 == 0) {
            if (n <= 26) {
                n = n / 2;
                builder.append(part(n, Direction.Forward));
                builder.append(part(n, Direction.Backward));

            }
        }
        String x = new String(builder);
        System.out.println(x);
    }

    static String part(int n, Direction direction) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        if (direction == Direction.Forward) {
            return s.substring(0, n);
        } else {
            return s.substring(26 - n, 26);
        }
    }

}
