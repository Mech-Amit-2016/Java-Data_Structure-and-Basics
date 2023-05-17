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
public class SelectionSort {
    public static void main(String[] args) {
                int a[]={37,-1,0,15,18};
    for(int i=0;i<=a.length-2;i++){
        
        int minindex=i;
        for(int j=i;j<=a.length-2;j++){
            if(a[minindex]>a[j+1]){
               minindex=j+1;
                
               }
              }
       int t=a[minindex];
       a[minindex]=a[i];
       a[i]=t;
       }
        System.out.println(Arrays.toString(a));
    }
}
