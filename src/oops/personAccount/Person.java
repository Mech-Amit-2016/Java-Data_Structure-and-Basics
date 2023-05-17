
package oops.personAccount;
import java.util.Scanner;

public class Person {
   String name,Address;
   int age;
    Person(){
       Scanner s=new Scanner(System.in);
       System.out.println("enter the name");
       name=s.nextLine();
       System.out.println("enter the Address");
       Address=s.nextLine();
       System.out.println("enter the Age");
       age=s.nextInt();     
   }
  Person(String name,String Address,int age){
       this.name=name;
       this.Address=Address;
       this.age=age;
   }
  
  
   @Override
   public String toString(){
       return "person={name="+name+ ",Address="+Address+", age="+age+"}";
     }
    public static void main(String[] args) {
        System.out.println(new Person());
    }
}
