package oops.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import oracle.jdbc.OracleDriver;

public class Menu {

//    public static void main(String[] args) throws SQLException {
//        DriverManager.registerDriver(new OracleDriver());
//        String url = "jdbc:oracle:thin:@localhost:1521:xe";
//        String user = "system", password = "pass";
//        Connection connection = DriverManager.getConnection(url, user, password);
//        PreparedStatement ps;
//        while (true) {
//            System.out.println("enter option\n0-exit\n1-update\n2-insert\n3-delete\n4-printdetails\n5-printrecord");
//            Scanner sc = new Scanner(System.in);
//            int n = Integer.parseInt(sc.nextLine());
//            switch (n) {
//                case 0:
//                    return;
//                case 1:
//                    try {
//                        System.out.println("enetr rollno");
//                        String rollno = sc.nextLine();
//                        System.out.println("enter the address");
//                        String address = sc.nextLine();
//                        System.out.println("enter mobno");
//                        String mobno = sc.nextLine();
//                        ps = connection.prepareStatement("update strecord set address=?,mobno=? where rollno=?");
//                        ps.setString(1, address);
//                        ps.setString(2, mobno);
//                        ps.setString(3, rollno);
//                        int x = ps.executeUpdate();
//                        System.out.println("inserted records" + x);
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 2:
//                    try {
//                        System.out.println("enter rollno");
//                        String rollno = sc.nextLine();
//                        System.out.println("enter name");
//                        String name = sc.nextLine();
//                        System.out.println("enter address");
//                        String address = sc.nextLine();
//                        System.out.println("enter mobno");
//                        String mobno = sc.nextLine();
//                        ps = connection.prepareStatement("insert into strecord values(?,?,?,?)");
//                        ps.setString(1, rollno);
//                        ps.setString(2, name);
//                        ps.setString(3, address);
//                        ps.setString(4, mobno);
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 3:
//                    try {
//                        System.out.println("enter rollno");
//                        String rollno = sc.nextLine();
//                        ps = connection.prepareStatement("delete from strecord where rollno=?");
//                        ps.setString(1, rollno);
//                        int v = ps.executeUpdate();
//                        System.out.println("delete record" + n);
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 4:
//                    try {
//                        System.out.println("enter roll no");
//                        String rollno = sc.nextLine();
//                        ps = connection.prepareStatement("select* from strecord where rollno=?");
//                        ps.setString(1, rollno);
//                        ResultSet rs = ps.executeQuery();
//                        if (!rs.next()) {
//                            System.out.println("No record");
//                        } else {
//                            System.out.println(rs.getObject("rollno"));
//                            System.out.println(rs.getObject("name"));
//                            System.out.println(rs.getObject("address"));
//                            System.out.println(rs.getObject("mobno"));
//                        }
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 5:
//                    try {
//                        ps = connection.prepareStatement("select* from strecord ");
//                        ResultSet rs = ps.executeQuery();
//                        while (rs.next()) {
//                            System.out.println(rs.getObject("rollno") + " " + rs.getObject("name") + " " + rs.getObject("address") + " " + rs.getObject("mobno"));
//                        }
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                default:
//                    System.out.println("select between 0-4");
//            }
//        }
//    }
}
