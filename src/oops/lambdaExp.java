/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author DELL
 */
public class lambdaExp {
    public static void main(String[] args) {
        MyInterface intrf = ()-> {return 0;} ;
        System.out.println(intrf.doSum());  
        intrf.doSum();
    }
}
