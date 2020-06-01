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
public class sum2 {
    public static void main(String args[]){
        int s=1,a=0;
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the value of n for series 1+2-3+4-....+n ");
         int n = sc.nextInt();
          for(int i=2;i<=n;i++){
              if(i%2==0){
                  s=s+i;
              } 
              else {
                     s=s-i;     
                     }    
              }
         
           System.out.print("Sum of n number series is="+s);
    }
}
