package oops;

public class Currency {

    int totalpaisa;

    public Currency(double rupees, int paisa) {
        totalpaisa = (int)(rupees * 100) + paisa;

    }

    @Override
    public String toString() {
        double d=totalpaisa/100.0;
            return String.format("Rs %s", d);
    }

    public static void main(String[] args) {
        Currency c1 = new Currency(20, 7);
        Currency c2 = new Currency(-25, 39);
        Currency c3 = new Currency(-25.50,38);
        System.out.println(c1 + "," + c2+","+c3);
//        System.out.println(c2);
    }

}
