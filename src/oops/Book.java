package oops;

public class Book {//Class definition

    String bookname, subject;//member variables
    int price;

    public Book(String bookname, String subject, int price) {//Constructor
        this.bookname = bookname;//Assignments
        this.subject = subject;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Subject=%s, Price=%s.", bookname, subject, price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("java", "object", 20);//Calling the constructor
        System.out.println(b1);
    }

}
