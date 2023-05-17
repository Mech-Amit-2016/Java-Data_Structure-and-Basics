package loops.forloop;

public class PrimeDemo1 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2, c = 0; i <= 500; i++, c = 0) {
            for (int j = 1; j <= i; j++) {
               if (i % j == 0) 
               c++;
               if(c>2)
               break;
               }
            if (c == 2) {
                System.out.println(i);
                count++;
                 }
         }
        System.out.println("total" + count);
    }
}
