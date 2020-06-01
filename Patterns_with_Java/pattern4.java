/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

/**
 *
 * @author jitesh
 */
public class pattern4 {
    public static void main(String args[]){
        for(int i=1;i<=7;i=i+2){
             System.out.println(" ");
             for(int k=6;k>=i;k--){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print(" ");
                   
                  System.out.print(j);
             }
        }
    }
    
}
