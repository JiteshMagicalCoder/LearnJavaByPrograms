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
public class threadfive extends Thread {
    public void run(){
        System.out.println("Hello World");
    }
    
}
class main 
{
    public static void main(String args[]){
        threadfive t1= new threadfive();
        threadfive t2= new threadfive();
        threadfive t3= new threadfive();
        threadfive t4= new threadfive();
        threadfive t5= new threadfive();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
