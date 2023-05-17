
package arrayspackage;

public class FillPrime {
    public static void main(String[] args) {
        int []a=new int[8];
      for(int i=2,k=0;;i++){
            int count=0;
             for(int j=1;j<=i;j++)
             {
                 if(i%j==0)
                    count++;
                 if(count>2)
                     break;
             }
             if(count==2)
             {
                 a[k]=i;
                 k++;
                 if(k==a.length)
                     break;
             }
        } 
      for(int i=0;i<a.length;i++)
          System.out.println(a[i]);
    }

}
