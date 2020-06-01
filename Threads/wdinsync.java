/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprograms;

/**
 *
 * @author jitesh
 */
public class wdinsync extends Thread{
     static int c=0;
    
    synchronized public void run() {
        
    
        for(int i=0;i<500000;i++){
       
        c++;
    }
        System.out.println("incremented value of c= "+c);
}
}
class c{
    
    public static void main(String args[]){
     wdinsync t1= new wdinsync();
       wdinsync t2= new wdinsync();
       t1.start();
       t2.start();
    }
   
    
}
