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
public abstract class MyAbstarct {
    int total;
   
    abstract public int increment();
    
    public MyAbstarct(){
//        this.total++;
        System.out.println("super class");
    }
}
