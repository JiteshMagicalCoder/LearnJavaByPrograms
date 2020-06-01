/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class triangle {
    int[] arr= new int[10];
    
       int l;
       void getvalue() throws IOException{
        BufferedReader br;
        InputStreamReader isr;
        isr= new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.println("Enter the array limit");
         l=Integer.parseInt(br.readLine());
        System.out.println("Enter the array elements");
        for(int i=0;i<l;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
       }
       void lower(){
           
           System.out.println(" lower triangle pattern");
           for(int i=1;i<=l;i++){
               for(int j=1;j<=i;j++){
                   System.out.print(j);
               }
               System.out.println(" ");
                                    
           }
           
       }
       
      void upper(){
           System.out.println(" ");
           System.out.println(" Upper triangle pattern");
           for(int i=l;i>0;i--){
               for(int j=1;j<=i;j++){
                   System.out.print(j);
               }
               System.out.println(" ");
               
               }
           }
               
       
       public static void main(String args[]) throws IOException{
        triangle obj= new triangle();
               obj.getvalue();
                obj.lower();
               obj.upper();
}
}
