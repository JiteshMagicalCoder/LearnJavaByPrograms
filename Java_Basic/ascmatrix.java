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
public class ascmatrix {
     int[][] arr = new int[3][3];
     
    int r,c;
   
    void getvalue() throws IOException{
         
           BufferedReader br;
          InputStreamReader isr;
           isr= new InputStreamReader(System.in);
           br= new BufferedReader(isr);            
           System.out.println(" Enter the number of rows of an array limit ");
           r =Integer.parseInt(br.readLine());
           System.out.println(" Enter the number of columns of an array limit ");
           c =Integer.parseInt(br.readLine());

          
           System.out.println(" Enter the arrays values ");
           for( int i=0;i<r;i++){
               for(int j=0;j<c;j++){
                   arr[i][j]=Integer.parseInt(br.readLine());
                   
               }
               System.out.println("Please enter"+ " "+(i+2)+" " +"row of a matrix");
           }
           
      }
    
    void asc(){
                    
           for( int i=0;i<r;i++){
               for(int j=0;j<c;j++){                             
                       if(arr[i][j]>arr[i+1][j+1])
                       {   
                            int s= arr[i][j];
                            arr[i][j]= arr[i+1][j+1];
                            arr[i+1][j+1]=s;
                                                 
                      }                
               }                   
                  
           }              
    }
    
    void disp()
    {           System.out.println(" Matrix in ascending order");
           for( int i=0;i<r;i++){
               for(int j=0;j<c;j++){                             
                 
                System.out.print(" "+arr[i][j]);
                
               }                   
                  
           }              
    
    }
    public static void main(String args[]) throws IOException{
        ascmatrix obj= new ascmatrix();
         obj.getvalue();
         obj.asc();
         obj.disp();
         
    }
}
