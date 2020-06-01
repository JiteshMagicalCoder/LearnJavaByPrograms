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
public class pattern9 {
    public static void main(String args[]){
           int l=0,s=2;
        for(int i=1;i<=4;i++){
            
            System.out.println(" ");
             
            for(int j=1;j<=i;j++){
                       l=s;    
                  
                System.out.print(l);
                s=s+3;
             System.out.print(" ");
        }
    }
    
    }
    
}
