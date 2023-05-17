package oops.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class Book implements Serializable {

    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }

    @Override
    public String toString() {
        return String.format("Book Name=%s,Subject=%s,Price=%s", bookname, subject, price);
    }

    public static void main(String[] args) {
        try {
            Book[] books = {new Book("java", "oops", 30), new Book("c++", "oops", 20)};
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Book.txt"));
            oos.writeObject(books);
            oos.flush();
            oos.close();
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Book.txt"));
            Book[] boook=(Book[])ois.readObject();
            ois.close();
            for(Book b:boook){
                System.out.println(b);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
