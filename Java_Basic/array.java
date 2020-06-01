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
public class array {
    
    int[] arr = new int[20];
    int n;
    
    void getvalue( ) throws IOException{
        
           BufferedReader br;
           InputStreamReader isr;
           
           isr= new InputStreamReader(System.in);
           br= new BufferedReader(isr);
           System.out.println(" Enter the array limit ");
             n =Integer.parseInt(br.readLine());
           System.out.println(" Enter the values of an array");      
           for ( int i=0;i<n;i++){
               
               arr[i]=Integer.parseInt(br.readLine());
           
               
           }
           
        
    }
    int sum(){
        int s=0 ;
        for(int i=0;i< n;i++){
            s= s + arr[i];
        }
        return s;
    }
    
    public static void main(String args[]) throws IOException{
        array obj= new array();
          
             obj.getvalue();
             System.out.println("sum of arrays="+obj.sum());
    }
}    

