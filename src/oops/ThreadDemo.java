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
public class ThreadDemo extends Thread{
    Thread thread=new Thread("amit");
    
    @Override
    public void run(){
        System.out.println("i am a thread");
    }

    public static void main(String[] args) {
            Thread thread=new Thread("amit");
             thread.start();
    }
}
