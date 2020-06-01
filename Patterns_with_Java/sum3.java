/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class sum3 {
      public static void main(String args[]){
        float s=0; int a=1; int t=1; 
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the value of n for series 1/1!+2/3!+3/4!+4/7!+.....+n/(n+2)!");
         int n = sc.nextInt();
         for(float i=1;i<=n;i++){
             float f=1;
            float k=0;
             while(a>0){
                 f=f*a;
                 a--;
             }
              k=(i/f);
             s=s+k;
             t=t+2;
             a=t;
         }
           System.out.print("Sum of n number series is="+s);
    }
}
