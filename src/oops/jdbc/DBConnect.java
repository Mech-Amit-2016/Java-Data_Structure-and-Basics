
package oops.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import oracle.jdbc.OracleDriver;

public class DBConnect {
//    public static void main(String[] args) throws SQLException {
//        DriverManager.registerDriver(new OracleDriver());
//        String url="jdbc:oracle:thin:@localhost:1521:xe";
//        String user="system",password="pass";
//        Connection connection=DriverManager.getConnection(url, user, password);
//        PreparedStatement ps;
//        while(true){
//            System.out.println("enter option\n0-exit\n1-update\n2-insert\n3-delete\n4-printdetails");
//        Scanner sc=new Scanner(System.in);
//        int n=Integer.parseInt( sc.nextLine());
//        switch(n){
//            case 0:
//                return;
//            case 1:
//                try{
//                System.out.println("enter name");
//                String name1=sc.nextLine();
//                System.out.println("enter roll no");
//                String rollnum=sc.nextLine();
//                 ps=connection.prepareStatement("update  student set name=? where rollno=?");
//               ps.setString(1,name1);
//               ps.setString(2,rollnum);
//               int x1=ps.executeUpdate();
//                System.out.println("inserted records "+ x1 );
//                }
//                catch(Exception ex){
//                    System.out.println(ex);
//                }
//                break;
//            case 2:
//                try{
//                System.out.println("enter name");
//                String name=sc.nextLine();
//                System.out.println("enter roll no");
//                String rollno= sc.nextLine();
//                ps=connection.prepareStatement("insert into  student values(?,?)");
//                ps.setString(1,name);
//                ps.setString(2,rollno);
//                int x=ps.executeUpdate();
//                System.out.println("inserted records "+ x );}
//                catch(Exception ex){
//                    System.out.println(ex);
//                }
//                break;
//            case 3:
//                try{
//                    System.out.println("enter roll no");
//                String rollnum=sc.nextLine();
//                ps=connection.prepareStatement("delete from student where rollno=?");
//                ps.setString(1,rollnum);
//        ps.execute();}
//                catch(Exception ex){
//                    System.out.println(ex);
//                }
//                break;
//            case 4:
//                try{
//                System.out.println("enter roll no");
//                String rollno=sc.nextLine();
//               ps=connection.prepareStatement("select* from student where rollno=?");
//               ps.setString(1,rollno);
//               ResultSet rs=ps.executeQuery();
//               if(!rs.next()){
//                   System.out.println("No record");
//               }
//               else{
//                   String myname=""+rs.getObject("name");
//                   System.out.println(myname);
//               }
//                }
//                catch(Exception ex){
//                    System.out.println(ex);
//                }
//            default :
//                System.out.println("select between 0-4");
//        }
//    }
//    }
}
