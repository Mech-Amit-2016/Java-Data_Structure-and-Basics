package sorting;

import java.util.Arrays;

public class CountNo {

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 4, 2, 6, 7, 0, 0, 8, 8, 9, 3, 4, 0};
        int[] frequencies = new int[10];
        int[] elementcount = new int[10];
        for (int i = 0; i <= a.length - 1; i++) {
            frequencies[a[i]]++;
        }
//        for (int i = 0; i <= frequencies.length - 1; i++) {
//            System.out.println(i + "--" + frequencies[i]);
//        }
          
        for (int i = 1; i <= frequencies.length - 1; i++) {
            elementcount[i] = elementcount[i - 1] + frequencies[i-1];
        }
      for(int i=a.length-1,j=9;i>=0;j--){
          while(frequencies[j]!=0 && i>=elementcount[j] ){
          a[i]=j;
          i--;}
      }
      System.out.println(Arrays.toString(a));
    }
}
