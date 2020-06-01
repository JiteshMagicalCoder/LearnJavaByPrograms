/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
public class finalclass {
    
    final void method(){
        final int x=10;
        
    }
}
  class mm extends finalclass{
      void method1(){
          int x = 0;
          System.out.println(" value of x"+x);
      }
      public static void main(String args[]){
          mm obj = new mm();
          obj.method();
          obj.method1();
      }
  }  
    

