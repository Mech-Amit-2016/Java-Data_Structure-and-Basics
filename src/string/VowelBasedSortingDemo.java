
package string;

import java.util.Arrays;

public class VowelBasedSortingDemo {
    public static void main(String[] args) {
        String []s={"Shyam","Laxman","Ram","Matang","Kashyap","Agastya","Bhriguuu","krishna"};
        int []b=new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            int c=0;
            for(int j=0;j<s[i].length();j++){
                char ch=s[i].toLowerCase().charAt(j);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    c++;
            }
            b[i]=c;
        }
        for(int i=0;i<=b.length-1;i++){
            for(int j=i;j<=b.length-2;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    String temp1=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp1;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
