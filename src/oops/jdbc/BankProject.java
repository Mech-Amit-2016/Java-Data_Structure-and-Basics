package oops.jdbc;

import java.sql.*;
import java.util.Scanner;
//import oracle.jdbc.OracleDriver;

public class BankProject {

//    public static void main(String[] args) throws SQLException {
//        DriverManager.registerDriver(new OracleDriver());
//        String url = "jdbc:oracle:thin:@localhost:1521:xe";
//        String user = "system", password = "pass";
//        Connection connection = DriverManager.getConnection(url, user, password);
//        PreparedStatement ps;
//        while (true) {
//            System.out.println("enter choice\n0-exit\n1-createAccount\n2-Deposit\n3-withdraw\n4-checkbalance\n5-printAccountholdersDetails\n6-deactivatAccount\n7-printTransactionsDetails");
//            Scanner sc = new Scanner(System.in);
//            int n = Integer.parseInt(sc.nextLine());
//            switch (n) {
//                case 0:
//                    return;
//                case 1:
//                    try {
//                        System.out.println("enter your name");
//                        String name = sc.nextLine();
//                        System.out.println("enter the amount to add");
//                        int amt = Integer.parseInt(sc.nextLine());
//                        String amount = Integer.toString(amt);
//                        ps = connection.prepareStatement("insert into bankaccount values(?,bankaccountnoseq.nextval,?)");
//                        ps.setString(1, name);
//                        ps.setString(2, amount);
//                        ps.execute();
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                case 2:
//                    try {
//                        System.out.println("enetr accNo");
//                        String accNo = sc.nextLine();
//                        ps = connection.prepareStatement("select balance from bankaccount where accno=?");
//                        ps.setString(1, accNo);
//                        ResultSet rs = ps.executeQuery();
//                        if (!rs.next()) {
//                            System.out.println("record not found");
//                            break;
//                        } else {
//                            System.out.println("enter the amount to deposit");
//                        }
//                        String beforeBalance = "" + rs.getObject("balance");
//                        System.out.println(beforeBalance);
//                        String amount = sc.nextLine();
//                        ps = connection.prepareStatement("update bankaccount set balance=balance+? where accno=?");
//                        System.out.println("*****");
//                        ps.setString(1, amount);
//                        ps.setString(2, accNo);
//                         ps.execute();
//                         ps=connection.prepareStatement("select* from bankaccount where accno=?");
//                         ps.setString(1,accNo);
//                         rs=ps.executeQuery();
//                         String afterBalance="";
//                         if(!rs.next()){
//              
//                          break;
//                         }
//                         else
//                             afterBalance=""+rs.getObject("balance");
//                        ps = connection.prepareStatement("insert into transactions values(bankaccountnoseq.nextval,?,'Deposit',?,?,sysdate)");
//
//                        ps.setString(1,accNo);
//      
////               
//                        ps.setString(2,beforeBalance);
//           
//                        ps.setString(3,afterBalance);
////                        ps.setString(5,"sysdate");
//                                      ps.execute();
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 3:
//                    try {
//                        System.out.println("enter account no");
//                        String accno = sc.nextLine();
//                        ps = connection.prepareStatement("select balance from bankaccount where accno=?");
//                        ps.setString(1, accno);
//                        ResultSet rs = ps.executeQuery();
//                        String Balance = "";
//                        if (!rs.next()) {
//                            System.out.println("record not found");
//                            break;
//                        } else {
//                            Balance ="" + rs.getObject("balance");
//                        }
//                        System.out.println("enter the amount to withdraw");
//                        String withdrawAmount = sc.nextLine();
//                        if (Integer.parseInt(withdrawAmount) > Integer.parseInt(Balance)) {
//                            System.out.println("cannot withdraw this amount");
//                            break;
//                        } else {
//                            ps = connection.prepareStatement("update bankaccount set balance=balance-? where accno=?");
//                            ps.setString(1, withdrawAmount);
//                            ps.setString(2, accno);
//                            ps.execute();
//                            ps=connection.prepareStatement("insert into transactions values(bankaccountnoseq.nextval,?,'withdraw',?,?-?,sysdate)");
//                            ps.setString(1,accno);
//                            ps.setString(2,Balance);
//                            ps.setString(3,Balance);
//                            ps.setString(4,withdrawAmount);
//                            ps.execute();
//                            System.out.println(withdrawAmount + " amount withdrwan");
//                        }
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 4:
//                    try {
//                        System.out.println("enter Account No");
//                        String accno = sc.nextLine();
//                        ps = connection.prepareStatement("select* from bankaccount where accno=?");
//                        ps.setString(1, accno);
//                        ResultSet rs = ps.executeQuery();
//                        if (!rs.next()) {
//                            System.out.println("record not found");
//                        } else {
//                            System.out.println("account balance is" + rs.getObject("balance"));
//                        }
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 5:
//                    try {
//                        ps = connection.prepareStatement("select* from bankaccount");
//                        ResultSet rs1 = ps.executeQuery();
//                        if (!rs1.next()) {
//                            System.out.println("no records found");
//                            break;
//                        } else {
//                            System.out.println("name  accountno  balance");
//                            while (true) {
//                                System.out.println(rs1.getObject("name") + " " + rs1.getObject("accno") + " " + rs1.getObject("balance"));
//                                if (!rs1.next()) {
//                                    break;
//                                }
//                            }
//                        }
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//                    break;
//                case 6:
//                    try {
//                        System.out.println("enter account no");
//                        String accno = sc.nextLine();
//                        ps = connection.prepareStatement("delete from bankaccount where accno=? ");
//                        ps.setString(1, accno);
//                        ResultSet rs = ps.executeQuery();
//                        if (!rs.next()) {
//                            System.out.println("no record found");
//                        } else {
//                            System.out.println(accno + " " + "account deactivated");
//                        }
//                        break;
//                    } catch (Exception ex) {
//                        System.out.println( ex);
//                    }
//                    break;
//                case 7:try{
//                    System.out.println("enter accountNo");
//                    String accno=sc.nextLine();
//                    ps=connection.prepareStatement("select* from transactions where accno=?");
//                    ps.setString(1,accno);
//                    ps.execute();
//                    break;}
//                catch(Exception ex){
//                    System.out.println(ex);
//                }
//                break;
//                default:
//                    System.out.println("wrong option,please select between 0-6");
//            }
//        }
//    }
}
