/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author jitesh
 */
public class constructor {
    int x=1;
    String y="J";
    constructor()
    {
         System.out.println(" I m default constructor");
    }
    constructor(int x){
        this.x=x;
        System.out.println(" I parameterize constructor");
       }
    constructor(int x,String y ){
        this.x=x;
        this.y=y;
        
    }
    void disp()
    {
        System.out.println(" I m method of first class");
    }
     
}
class kk extends constructor{
    kk(){
        super();
        System.out.println(" I m default constructor of kk class");
    }
    kk(int x){
         super(x);
        this.x=x;
        System.out.println(" I m constructor of kk class");
    }
    
    void disp(){
        super.disp();
        System.out.println(" I m method of kk class");
    }
    
}
class jj {
    public static void main(String args[]){
        
        kk obj= new kk();
       kk obj1= new kk(5);
        constructor obj2= new constructor(8,"jitesh");
          obj.disp();
           
    }
}