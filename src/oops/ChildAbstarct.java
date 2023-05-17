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
public  class ChildAbstarct extends MyAbstarct{
    
    public ChildAbstarct(){
        total++;
        System.out.println("total = "+total);
    }
    @Override
    public int increment() {
        System.out.println("Incremet");
        return 0;
    }
    
    public static void main(String[] args) {
        ChildAbstarct child=new ChildAbstarct();
        
    }
}
