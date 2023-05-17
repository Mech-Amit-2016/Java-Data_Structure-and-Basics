package oops.personAccount;
import java.util.Scanner;

public class Account {

    private Person customer;
    private Currency balance;
    private String AccountNo;

    Account( String AccountNo) {
        this.AccountNo = AccountNo;
        customer = new Person();
        balance = new Currency();
    }
    Account(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the account no");
        AccountNo=s.nextLine();
        customer =new Person();
        balance =new Currency();    
     }
    Account(String AccountNo,Currency balance,Person customer){
        this.AccountNo=AccountNo;
        this.balance=balance;
        this.customer=customer;
    }

    @Override
    public String toString() {
        return "AccountNo=" + AccountNo + "\n" + customer.toString() + "\n" + balance.toString();
    }

    public static void main(String[] args) {
//        Account acc = new Account();
//        System.out.println(acc);
        Person person=new Person();
        Currency balance=new Currency();
        Account acc=new Account("BOB9876",balance,person);
        System.out.println(acc);
    }
}
