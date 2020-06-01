/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class circle {
    double radius=1.0;
    String color="red";
    circle(){
        
    }
    circle(double radius){
     this.radius = radius;   
    }
   double getradius(){
    System.out.println(" Enter the radius");
    Scanner sc = new Scanner(System.in);
      radius=sc.nextInt();
      return(radius);
    
  }
   double getarea(){
         float a;
          a=(float) (3.14*radius*radius);
          return a;
          }
   
}
class cylinder extends circle{
    double height=1.0;
    cylinder(){
    }
    
    cylinder(double radius){
       this.radius= radius;

   }
    cylinder(double radius, double height)
    {
        this.radius= radius;
        this.height=height;
    }
    double getheight(){
        System.out.println(" Enter the height");
    Scanner sc = new Scanner(System.in);
      height=sc.nextInt();
      return(height);
      
    }
  double getvolume( ){
      float v=0;
      v=(float) ((3.14*radius*radius*height)/3);
      return(v);
  }

    

}

class call{
    public static void main(String args[]){
        cylinder obj= new cylinder();
                obj.getradius();
                System.out.println(" Area of circle="+obj.getarea());
                obj.getheight();
                System.out.println(" Volume of cylinder="+obj.getvolume());
    }
}