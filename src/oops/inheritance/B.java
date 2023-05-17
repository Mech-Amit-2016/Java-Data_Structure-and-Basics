
package oops.inheritance;

public class B extends A {
  String x="class B variable";
  
  
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.x);
        b.print();
    }
}
