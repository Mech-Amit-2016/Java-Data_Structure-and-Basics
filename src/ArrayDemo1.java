
import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        System.out.println("enter the elements of array");
//        int[] arr = new int[]{s.nextInt(), s.nextInt(), 5};
//        System.out.println("Array elements are");
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr[i]);
              int a[]=new int[9];
              for(int i=0;true;i++)
              {
                  int x=s.nextInt();
                  if(x==-1)
                      break;
                a[i]=x;
                        }
        
    }

}
