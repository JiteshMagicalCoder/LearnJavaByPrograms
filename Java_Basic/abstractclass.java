/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
 abstract class  abstractclass {
    abstract void disp();
    void show(){
        System.out.println("Hello m not abstract method");
    }
 }

class dd extends abstractclass{
    @Override
    void disp(){
        System.out.println("Hello m declare here");
    }
        
  public static void main(String args[]){
      dd obj= new dd();
      obj.show();
      obj.disp();
  }  
    
}
