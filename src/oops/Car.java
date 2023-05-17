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
public class Car {
    String color="blue";
}

class Lamboo extends Car{
    String color="white";
    
    Lamboo(){
        System.out.println(super.color);
        System.out.println(this.color);
        System.out.println(color);
    }
    public static void main(String[] args) {
        Lamboo boo=new Lamboo();
    }
}