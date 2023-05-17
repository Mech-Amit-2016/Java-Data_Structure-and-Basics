
package oops.studentProject;

import java.util.Scanner;

public class StudentDetails {

    int marks;
    String name, mobNo;

    StudentDetails(int marks, String name, String mobNo) {
        this.marks = marks;
        this.name = name;
        this.mobNo = mobNo;
    }

    public static String readName() {
        Scanner scn = new Scanner(System.in);

        while (true) {

            {
                String name = scn.nextLine().trim().toLowerCase();
                try {
                    if (name.length() <= 1) {
                        throw new InvalidNameException("minimun two character required");

                    }
                    for (int i = 0; i <= name.length() - 1; i++) {
                        char ch = name.charAt(i);
                        if (ch < 'a' || ch > 'z') {
                            throw new InvalidNameException("please enter only alphabets");
                        }
                    }
                    return name;
                } catch (InvalidNameException ex) {
                    System.out.println(ex.getMessage());

                }
            }

        }

    }

    public static String readMobNo() {
        Scanner scm = new Scanner(System.in);
        while (true) {
            {
                String mobNo = scm.nextLine();
                try {
                    if (mobNo.length() != 10) {
                        throw new InvalidMobNoException("enter 10 digit no only");
                    }
                    for (int i = 0; i < mobNo.length(); i++) {
                        char ch = mobNo.charAt(i);
                        if (ch < '0' || ch > '9') {
                            throw new InvalidMobNoException("please enter only numeric character");
                        }
                    }
                    return mobNo;
                } catch (InvalidMobNoException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    public static int readMarks(){
        while(true){
            try{
                 Scanner scm=new Scanner(System.in);
            int n=scm.nextInt();
            try{
                if(n<0 || n>100)
                    throw new InvalidMarksException("please enter no into the range 0-100");
                return n;
            }
            catch(InvalidMarksException ex){
                System.out.println(ex.getMessage());
            }
            }
            catch(Exception ex){
                System.out.println("invalid marks,enter only digits\nenter the marks"
                        + "");
            }
        }
    }
    @Override
    public String toString(){
        return "name="+name+", mobileNo="+mobNo+", marks="+marks;
    }

    public static void main(String[] args) {
        System.out.println("enter name");
        String name = readName();
        System.out.println("enter mobile no");
        String mobNo = readMobNo();
        System.out.println("enter the marks");
        int marks=readMarks();
        StudentDetails student=new StudentDetails(marks,name,mobNo);
        System.out.println(student);
    }
}
