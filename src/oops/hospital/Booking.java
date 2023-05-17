package oops.hospital;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking implements Serializable{

    private int sno;
    private Person patient;
    private Time startTime, endTime;
    private boolean isbooked;

    public void Patient() {
        if (!isbooked) {
            patient = new Person();
            isbooked = true;
        } else {
            patient = new Person(null, null, 0);
            isbooked = false;
        }
    }

    @Override
    public String toString() {
        if (patient == null) {
            return "Booking{" + "sno=" + sno + ", startTime=" + startTime + ", endTime=" + endTime + ", isbooked=" + isbooked + '}';
        } else {
            return "Booking{" + "sno=" + sno + ", patient=" + patient + ", startTime=" + startTime + ", endTime=" + endTime + ", isbooked=" + isbooked + '}';
        }

    }

    public Booking(int sno, Time startTime, Time endTime) {
        this.sno = sno;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getSno() {
        return sno;
    }

    public Person getPatient() {
        return patient;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public static void main(String[] args) {

    }
}
