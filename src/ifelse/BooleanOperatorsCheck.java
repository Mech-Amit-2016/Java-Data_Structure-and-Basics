package ifelse;
 
public class BooleanOperatorsCheck {

    public static void main(String[] args) {
        int a = 2, b = 1;
        //Comparison
        System.out.println("Comparisons");
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        //Logical And &&, Or || Not !
        System.out.println("And");
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

        System.out.println("Or");
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println("Not");
        System.out.println(!false);
        System.out.println(!true);

    }
}
