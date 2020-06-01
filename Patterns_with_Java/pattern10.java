/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

/**
 *
 * @author PC
 */
public class pattern10 {
public static void main(String args[]){
    for(int i=4;i>=1;i--){
         System.out.println(" ");
         for(int j=1;j<=i;j++){
              System.out.print(j);
         }for(int l=i;l<4;l++){
             System.out.print("*");
         }
          for(int m=i;m<4;m++){
              System.out.print("*");
          }
         for(int k=i;k>=1;k--){
             System.out.print(k);
         }
         
        
}    
}}
