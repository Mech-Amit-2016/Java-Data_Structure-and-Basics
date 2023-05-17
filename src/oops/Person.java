
package oops;
import java.util.Scanner;

public class Person {
String name,address;
int age;
   Person(String name,int age,String dob){
    this.name=name;
    this.age=age;
    this.address=address;
   }

    Person() {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name");
        name=s.nextLine();
        System.out.println("enter the address");
        address=s.nextLine();
        System.out.println("enter age");
        age=s.nextInt();
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address+ ", age=" + age + '}';
    }

}
