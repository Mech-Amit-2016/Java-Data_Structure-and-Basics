package oops.hospital;

import java.io.Serializable;
import java.util.Scanner;

public class Time implements Serializable{

    int hour;
    int minuet;
    int totalminuet;

    public static void main(String[] args) {
        Time t = new Time();
        System.out.println(t);
    }

    public Time() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hour");
        hour = s.nextInt();
        System.out.println("Enter the minuet");
        minuet = s.nextInt();
        totalminuet = hour * 60 + minuet;
    }

    public Time(int hour, int minuet) {
        this.hour = hour;
        this.minuet = minuet;
        totalminuet = hour * 60 + minuet;
    }

    @Override
    public String toString() {
        hour = totalminuet / 60;
        minuet = totalminuet % 60;
        if (minuet == 0) {
            return hour + ":" + "00";
        } else {
            return hour + ":" + minuet;
        }
    }
}
