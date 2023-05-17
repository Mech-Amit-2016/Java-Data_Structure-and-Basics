
package ifelse.switchpackage;

public class NumberToWords {
    public static void main(String[] args) {
        int n=5;
        switch(n)
        {
            case 0:
                System.out.println("Zero");
            case 1:
                System.out.println("one");
             case 2:
                System.out.println("two");
             case 3:
                System.out.println("three");
             case 4:
                System.out.println("four");
             case 5:
                System.out.println("five");
             case 6:
                System.out.println("six");
             case 7:
                System.out.println("seven");
                break;
             case 8:
                System.out.println("eight");
             case 9:
                System.out.println("nine");
                default:
                    System.out.println("Invalid");
        }      
    }
}
