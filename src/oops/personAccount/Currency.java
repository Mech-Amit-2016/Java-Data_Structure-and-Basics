package oops.personAccount;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Currency c=new  Currency();
        System.out.println(c);
    }
    private int totalpaisa;

    public Currency(int rupees, int paisa) {
        this.totalpaisa = 100 * rupees + paisa;
    }

    public Currency() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rupees");
        int r = Integer.parseInt(s.nextLine());
        System.out.println("Enter the paisa");
        int p = Integer.parseInt(s.nextLine());
        this.totalpaisa = r * 100 + p;
    }

    @Override
    public String toString() {
        int paisa = totalpaisa % 100;
        int rs = totalpaisa / 100;
        return "Rs " + rs + "." + paisa;
    }
}
