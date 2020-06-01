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
public class uniqueno extends Thread {
    
    public void run()
    {
         long ThreadId=Thread.currentThread().getId();
        System.out.println(" Hello World"+ThreadId );
    }
    
}

class a {
    public static void main(String args[]){
        uniqueno t1= new uniqueno();
        uniqueno t2= new uniqueno();
        uniqueno t3= new uniqueno();
        uniqueno t4= new uniqueno();
        uniqueno t5= new uniqueno();
        
        
           
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
  
    }
}