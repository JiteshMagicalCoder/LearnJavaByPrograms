/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprograms;

/**
 *
 * @author PC
 */
public class Threadprograms extends Thread {
    public void run(){
        System.out.println("Hello world!");
    }
}
 class maincalling{
     
public static void main(String[] args) {
Threadprograms t1= new Threadprograms();
 t1.start();
}
    
}
