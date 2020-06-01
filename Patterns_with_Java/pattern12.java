/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

/**
 *
 * @author jitesh
 */
public class pattern12 {
 public static void main(String args[]){
        int s=1;
        for(int i=1;i<=4;i++){
              System.out.println(" ");
            for(int j=1;j<=i;j++){
                
                 System.out.print(j);
            }
            for(int m=i;m<=3;m++){
                System.out.print(" ");
            }
           for(int k=i;k<=2;k++){
                System.out.print(" ");
            } 
            for(int l=i;l>=s;l-- ){
              
                 if(i==4){
                    s=2;
                System.out.print(l-1);
                }
                else{
                    System.out.print(l);
                }
                 
            }
        }
 }
}
