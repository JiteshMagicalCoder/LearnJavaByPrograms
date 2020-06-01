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
public class pattern0 {
      public static void main(String args[]){
          int s=1;
              for(int i=1;i<=2;i++){
                System.out.println(" ");
                for(int j=1;j<=i;j++){
                 System.out.print(s);
                    s=s+1;
                }}
                int l=3;int m=2;
                for(int k=1;k<=3;k++){
                    System.out.println(" ");
                     
                    for(int j=1;j<=m;j++){
                        if(k==1 && j==1)
                        {
                            System.out.print(l);
                        }
                       else if(k==2 && j==1)
                        {
                            System.out.print(l*2);
                        }
                       else if(k==3 && j==1)
                        {
                            System.out.print(l*4);
                            
                        }
                        System.out.print(j+1);
                    }m=m+1;
              }
      }}