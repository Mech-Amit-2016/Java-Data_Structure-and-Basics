package oops;

public class Rectangle {

    int length, breadth;

    public Rectangle() {
        this(0, 0);
//       length=0;
//       breadth=0;
    }

    public Rectangle(int a) {
        this(a, a);
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return (length * breadth);
    }

    public int perimeter() {
        return 2 * (length +breadth);
    }

    public double diagonal() {
        return Math.sqrt(length *length + breadth * breadth);
    }

    @Override
    public String toString() {
        return String.format("area=%s  ,perimeter=%s, diagonal=%s", area(),perimeter(),diagonal());
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(8);
        System.out.println(rec);
        Rectangle rec1=new Rectangle(3,4);
        System.out.println(rec1);
        Rectangle rec2=new Rectangle();
        System.out.println(rec2);
    }
}
