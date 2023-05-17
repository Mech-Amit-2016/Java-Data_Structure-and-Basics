package oops.hospital;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Clinic {

    public static ArrayList<Booking> readBookings() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BookingSlots.txt"));
            ArrayList<Booking> bookings = (ArrayList<Booking>) ois.readObject();
            return bookings;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ArrayList<Booking> bookings = new ArrayList();
            bookings.add(new Booking(1, new Time(10, 30), new Time(10, 55)));
            bookings.add(new Booking(2, new Time(11, 00), new Time(11, 25)));
            bookings.add(new Booking(3, new Time(11, 30), new Time(11, 55)));
            bookings.add(new Booking(4, new Time(12, 00), new Time(12, 25)));
            bookings.add(new Booking(5, new Time(12, 30), new Time(12, 55)));
            return bookings;
        }
    }

    public static void saveBookings(ArrayList<Booking> bookings) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BookingSlots.txt"));
            oos.writeObject(bookings);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        ArrayList<Booking> bookings = readBookings();
        while (true) {
            System.out.println("0-Exit");
            System.out.println("1-booking");
            System.out.println("2-Cancel");
            System.out.println("3-Print all");
            int option = s.nextInt();
            switch (option) {
                case 0:
                    saveBookings(bookings);
                    return;
                case 1:
                    Scanner sc=new Scanner(System.in);
                    System.out.println("booking");
                    printAllSlots(bookings);
                    System.out.println("Enter sno No you want to book");
                    int sno = Integer.parseInt(sc.nextLine());
                    Booking b = bookings.get(sno - 1);
                    System.out.println(b);
                    b.Patient();
                    System.out.println(b);

                    break;
                case 2:
                    Scanner scn=new Scanner(System.in);
                    System.out.println("Cancel");
                    printAllBookslot(bookings);
                    System.out.println("Enter sno you want to cancel");
                    int sno1 = Integer.parseInt(scn.nextLine());
                    
                    Booking c = bookings.get(sno1 - 1);
                    System.out.println(c);
                    c.Patient();
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println("Print all");
                    printAllBookslot(bookings);
                    break;
            }
        }
    }

    private static void printAllSlots(ArrayList<Booking> bookings) {
        System.out.println("Available Slots");
        for (Booking booking : bookings) {
            if (!booking.isIsbooked()) {
                System.out.println(booking);
            }
        }
    }

    private static void printAllBookslot(ArrayList<Booking> bookings) {
        System.out.println("Booking slots");
        for (Booking booking : bookings) {
            if (booking.isIsbooked()) {
                System.out.println(booking);
            }
        }
    }
}
