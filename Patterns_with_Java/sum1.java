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
public class sum1 {

    public static void main(String args[]){
        int s=0,a=0;
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the value of n for series 1+2+3+....+n ");
         int n = sc.nextInt();
         while(n>0){
             a=a+1;
             n--;
             s=s+a;
         }
           System.out.print("Sum of n number series is="+s);
    }
}
