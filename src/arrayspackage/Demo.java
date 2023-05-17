
package arrayspackage;

public class Demo {
    public static void main(String[] args) {
        int[] a={3,5,7,8,9,3,5,7,3,5,7,0,9,1,3,5,7};
        int []b={3,5,7};
        int count=0;
        
        Counter:
        for(int i=0;i<=a.length-b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i+j] != b[j])
                continue Counter;
            }
            count++;
            System.out.println(i);
        } 
        System.out.println(count);
    }

}
