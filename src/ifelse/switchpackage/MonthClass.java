package ifelse.switchpackage;

import java.util.Scanner;

public class MonthClass {

    public static void main(String[] args) {
        System.out.println("enter the  month");
        Scanner s = new Scanner(System.in);

        int mnt = s.nextInt();
        switch (mnt) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("Enter year");
                int yr = s.nextInt();
                if (yr % 400 == 0) {
                    System.out.println("leap year 29");
                } else if (yr % 4 == 0 && yr % 100 != 0) {
                    System.out.println("leap year 29");
                } else {
                    System.out.println("28");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;

            default:
                System.out.println("not valid");
        }
    }
}
