
package oops;

public class Employee extends Person{
String designation;
int salary;

Employee(String designation,int salary,String name,String dob,int age ){
    super(name,age,dob);
    this.designation=designation;
    this.salary=salary;
  }

@Override
public String toString(){
    return "Employee={"+super.toString()+", designation="+designation+", salary="+salary+"}";
}
public static void main(String arg[]){
    Employee emp=new Employee("developer",28000,"amit","09/09/1996",26);
    System.out.println(emp);
}
}
