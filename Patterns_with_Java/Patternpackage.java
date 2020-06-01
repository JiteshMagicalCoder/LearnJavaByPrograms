/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

/**
 *
 * @author jitesh
 */
public class Patternpackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for(int i=1;i<=5;i++){
         System.out.println(" ");
         for(int k=5;k>=i;k--){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print(" ");
             System.out.print(j);
         }
         for(int l=i-1;l>=1;l--){
             System.out.print(" ");
             System.out.print(l);
         }
     }   
        
    }
}
