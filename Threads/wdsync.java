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
public class wdsync extends Thread{
    static int c=0;
    
    public void run() {
        System.out.println("Incrementing value of c");
    
        for(int i=0;i<500000;i++){
       
        c++;
    }
        System.out.println("incremented value of c= "+c);
}
}
class b{
    
    public static void main(String args[]){
     wdsync t1= new wdsync();
       wdsync t2= new wdsync();
       t1.start();
       t2.start();
    }
    
}
