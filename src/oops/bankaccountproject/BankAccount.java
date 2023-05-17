package oops.bankaccountproject;
import java.util.Scanner;

import oops.exception.UnCheckedExc;

public class BankAccount extends UnCheckedExc {

    private String name, accountNo;
    private int Balance;

    BankAccount(String name, String accountNo, int Balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.Balance = Balance;
    }

    public void deposit(int amount) throws InsufficientBalanceException {
        if(amount<=0){
            throw new InsufficientBalanceException("invalid amount");
        }
        Balance = amount + Balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (Balance < amount ) {
            
 
            throw new InsufficientBalanceException(amount);
        }
        
        if(amount<=0){
            throw new InsufficientBalanceException("withdrawing invalid amount");
        }

        Balance = Balance - amount;
    }

    @Override
    public String toString() {
        return String.format("name=%s ,Accountno=%s ,Balance=%d", name, accountNo, Balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Amit", "120", 1200);
        while(true){
            System.out.println("press any options below\n0-Exit\n1-Deposit\n2-Withdraw\n3-print Details");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            switch(n){
                case 0:
                    return;
                case 1:
                    System.out.println("enter the amount to deposit");
                    try{
                    acc.deposit(s.nextInt());}
                    catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("enter the amount to withdraw");
                    try{
                        acc.withdraw(s.nextInt());
                     }
                    catch(Exception ex)
                    { System.out.println(ex.getMessage());} 
                    break;
                case 3:
                    System.out.println(acc);
                    break;
                default :
                    System.out.println("invalid option.");
            }
        }
        
//        System.out.println(acc.name);
//        System.out.println(acc);
//        try{
//        acc.withdraw(-10200);
//        System.out.println(acc);
//        }
//        catch(Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
    }
}
