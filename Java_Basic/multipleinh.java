/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
public class multipleinh {
    void show(){
        System.out.println(" Hello m super class");
    }
    
}

interface I1{ 
 void msg1();   
 }

interface I2{
    void msg2();
          }
class test extends multipleinh implements I1, I2{ 
    @Override
     public void msg1(){
         System.out.println(" m method of interface I1");
    }
    @Override
   public  void msg2(){
         System.out.println(" m method of interface I2");
    }
}
class s {
    public static void main(String args[]){
    test obj = new test();
    obj.show();
    obj.msg1();
    obj.msg2();
    }
}