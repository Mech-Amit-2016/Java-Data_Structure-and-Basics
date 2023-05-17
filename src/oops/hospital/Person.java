
package oops.hospital;


import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {

    String name, address;
    int age;
    public static void main(String[] args) {
        Person pc=new Person();
        System.out.println(pc);
    }
    public Person(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the patient Name");
        this.name=s.nextLine();
        System.out.println("Enter the Address");
        this.address=s.nextLine();
        System.out.println("Enter the age");
        this.age=s.nextInt();
    }
    public Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    @Override
    public String toString(){
        return "patient Name="+name+" "+"Address="+address+" "+"age="+age;
    }
}