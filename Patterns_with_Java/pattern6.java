/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpackage;

/**
 *
 * @author jitesh
 */
public class pattern6 {
    public static void main(String args[]){
        int a=1, b=0;
        for(int i=1;i<=5;i++){
              System.out.println(" ");
            for(int j=1;j<=i;j++){
                if(j%2==0){
                 System.out.print(b);
                 }
                else
                 System.out.print(a);
            }
        }
    }
    
}
