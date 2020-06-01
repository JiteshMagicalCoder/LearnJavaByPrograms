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
public class pattern7 {
    public static void main(String args[]){
        for(int i=0;i<=3;i++){
             System.out.println(" ");
            for(int k=3;k>=i;k--){
                System.out.print(" ");
            }
             for(int j=i;j>=0;j--){
                 
                 System.out.print(j);
             }
    for(int l=i;l>=1;l--){
        System.out.print(l);
    }
}
    }}