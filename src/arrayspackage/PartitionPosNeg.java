
package arrayspackage;

public class PartitionPosNeg{
    public static void main(String[] args){
        int a[]={-1,-2,6,8,-3,-8,4,0,1,9};
        int part=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>0)
                continue;
            for(int j=i; j>part; j--)
            {
               int c=a[j];
               a[j]=a[j-1];
               a[j-1]=c;
            }
            part++;
        }
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }

}
