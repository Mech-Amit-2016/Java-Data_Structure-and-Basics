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
public class Child extends Parent{
    static int x=1;
    
    @Override
       void increment(){
        System.out.println("no change in value");
//        return 0;
    }
    public static void main(String[] args) {
//        System.out.println(x); 
        new Child().increment();
    }
}
