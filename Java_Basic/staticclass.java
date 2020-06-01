/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
public class staticclass {
    static int x =10;
    void disp(){
        
        System.out.println(" I m method 1st =" +(x+1));
    
}}
class ll extends staticclass{
     
    void disp(){
            super.disp();
           System.out.println(" I m satic method of ll and value of x ="+x);
           
    }
    public static void main(String args[])
    { 
           ll obj = new ll();
         obj.disp();
        System.out.println(" I m main class");
     
       
    }
}
