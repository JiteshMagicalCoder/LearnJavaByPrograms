/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
public class multilevel {
    void msg1(){
         System.out.println(" I m method of superclass");
    }
    
}
class second extends multilevel{
    void msg2(){
         System.out.println(" I m method of second class");
    }
}

class third extends second{
    void msg3(){
        System.out.println(" I m method of third class");
    }
}

class main{
    public static void main(String args[]){
         third obj= new third();
               obj.msg1();
               obj.msg2();
               obj.msg3();
           
}
}