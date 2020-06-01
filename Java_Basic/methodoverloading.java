/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class methodoverloading {
    private int a;
    Scanner sc= new Scanner(System.in);
    void show()
    {
     System.out.println("m empty");
}
    void show(int a)
    {    int c=0;
         c=a;
         System.out.println("Value of a=" +a);
    }
    
   void show(double b, String n)
    {  double a=0;
      String s;
      a=b;
     s=n;
     System.out.println("Value of b=" +b);
     System.out.println("name=" +n);    
          
   }
   public static void main(String arg[]){
    methodoverloading obj= new methodoverloading();
                      obj.show();
                      obj.show(5);
                      obj.show(100,"kites");
}
}

