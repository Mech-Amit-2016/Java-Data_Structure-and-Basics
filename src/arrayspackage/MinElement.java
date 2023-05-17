
package arrayspackage;

public class MinElement {
    public static void main(String[] args) {
        int a[]={6,8,68,34,69,23,-9};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        { 
            if(min>a[i])
               min=a[i];
        }
        System.out.println("minimum value is "+min);
    }

}
