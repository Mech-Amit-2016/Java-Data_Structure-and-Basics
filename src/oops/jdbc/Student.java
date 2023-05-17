
package oops.jdbc;

public class Student {
String name,dob;
int rollNo;
Student(String name,String dob,int rollNo){
    this.name=name;
    this.dob=dob;
    this.rollNo=rollNo;
  }
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", dob=" + dob + ", rollNo=" + rollNo + '}';
    }
    public static void main(String[] args) {
        Student st1=new Student("Amit","12/12/1993",12);
        System.out.println(st1);
    }
}

