package loops.forloop;

// User function Template for Java
import java.lang.StringBuilder; 

class Solution {

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

    static String BalancedString(int N) {
        // code here
        StringBuilder builder = new StringBuilder();
        if (N % 2 == 0) {
            while (N > 26) {
                N = N - 26;
                builder.append(part(13, Direction.Forward));
                builder.append(part(13, Direction.Backward));

            }
            if (N > 0) {
                builder.append(part(N / 2, Direction.Forward));
                builder.append(part(N / 2, Direction.Backward));
            }

        } else {
             while (N > 26) {
                N = N - 26;
                builder.append(part(13, Direction.Forward));
                builder.append(part(13, Direction.Backward));

            }
            int c = 0;
            while (N > 0) {
                c = c + N % 10;
            }
            if (c % 2 == 0) {
                builder.append(part((N + 1) / 2, Direction.Forward));
                builder.append(part((N - 1) / 2, Direction.Forward));
            } else {
                builder.append(part((N - 1) / 2, Direction.Forward));
                builder.append(part((N + 1) / 2, Direction.Forward));
            }
        }
        String x = new String(builder);
        // System.out.println(x);
        return x;
    }

    static String part(int N, Direction direction) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        if (direction == Direction.Forward) {
            return s.substring(0, N);
        } else {
            return s.substring(26 - N, 26);
        }
    }


enum Direction {
    Forward, Backward;
}
}