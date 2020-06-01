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
public class pattern11 {
    public static void main(String args[]){
    for(int i=1;i<=4;i++){
        System.out.println(" ");
        for(int k=i;k<=4;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    } 
    for(int l=3;l>=1;l--){
          System.out.println(" ");
     for(int k=4;k>=l;k--){
            System.out.print(" ");
        }
     for(int m=l;m>=1;m--){
           System.out.print("*");
         
     }
}}}
    

