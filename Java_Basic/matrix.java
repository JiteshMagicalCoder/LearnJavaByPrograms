/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;
import java.io.*;

/**
 *
 * @author jitesh
 */
public class matrix {
    
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
    
    void calsum(){
         int sr=0;
         int sc=0;
         int sad=0, sd=0;
           for( int i=0;i<r;i++){
                  for( int j=0;j<c;j++){
                      sr= sr + arr[i][j];
                      if(i==j)
                      {
                          sd=sd+arr[i][j];
                      }
                  }
             System.out.println("sum of row "+(i+1)+" =  " +sr);
              sr=0;
           }
           for(int j=0;j<r;j++ ){
               for(int i=0;i<r;i++){
               sc= sc + arr[i][j];
               }
               System.out.println("sum of column "+(j+1)+" =  " +sc);
                sc=0;
                       
               
           }
           
           if (r==c){
          for(int i=0; i<r;i++){
               int j=c-1;
               sad= sad + arr[i][j];
               c--;
           }
        System.out.println("sum of diagonal of a matrix=" +sd);
        System.out.println("sum of anti-diagonal of a matrix=" +sad);
           }
           else
           {
             System.out.println("sum of diagonal is possible only in equal matrix");  
           }
    }
    
      public static void main(String args[]) throws IOException{
                   
          matrix obj= new matrix();          
            obj.getvalue();
          obj.calsum();
      }
    
}
