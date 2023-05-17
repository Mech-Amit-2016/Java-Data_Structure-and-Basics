
package arrayspackage;

import java.util.Arrays;

public class Weight {
    public static void main(String[] args) {
        int []a={2,2,0};
        int []b=new int[3];
        for(int i=0;i<=2;i++){
            if(a[i]==1)
                continue;
            b[a[i]]=b[a[i]]+i;
        }
        int ans=0;
        int max=b[0];
        System.out.println(Arrays.toString(b));
        for(int i=0;i<=2;i++){
            if(b[i]>=max){
                max=b[i];
                ans=i;}
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
