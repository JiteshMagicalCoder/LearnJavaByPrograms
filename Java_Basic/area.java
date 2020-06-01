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
public class area {
    
    Scanner sc= new Scanner(System.in);
    void Area()
    {
     System.out.println("Enter radius of circle");
     float r=sc.nextFloat();
     float area=(float) (3.14*r*r);
     System.out.println("Area of circle= " +area);
}
    void Area(int b,float h)
            {
              System.out.println("Enter the base of triangle");
             int ba=sc.nextInt();
       System.out.println("Enter the height of height of triangle");
       float hi=sc.nextInt();
       double area=(ba*hi)/2;
     System.out.println("Area of Triangle= " +area);
            }
    void Area(int m,int k )
    {    System.out.println("Enter the length of rectangle");
     int l=sc.nextInt();
       System.out.println("Enter the breadth of rectangle");
       int b=sc.nextInt();
       double area=l*b;
     System.out.println("Area of Rectangle= " +area);
}
    
   void Area(int s)
    {
     System.out.println("Enter the side of square");
     double a=sc.nextDouble();
     double area=a*a;
      System.out.println("Area of Square= " +area);    
   }
   public static void main(String arg[]){
    area obj= new area();
                      obj.Area();
                      obj.Area(4, (float) 15.2);
                      obj.Area(5,10);
                      obj.Area(5);
}
}   

