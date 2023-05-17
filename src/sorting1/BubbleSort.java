/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting1;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[]={37,-1,0,15,18};
        for(int i=0;i<=a.length-2;i++){
            for(int j=0;j<=a.length-i-2;j++){
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
                    System.out.println(Arrays.toString(a));

        }
        System.out.println(Arrays.toString(a));
    }
   
    
}
