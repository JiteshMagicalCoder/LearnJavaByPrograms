/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jitesh
 */
public class frequencyeach {
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
        void count(){
                             
        for( int i=0;i<l;i++){
            int c=0;
         for(int j=0;j<l;j++){
            if(arr[i]==arr[j]){
                c++;
            }
                        
            }
           
            
            System.out.println("Frequency of"+" "+arr[i]+" = " +c);   
        }
        
    }
         
 public static void main(String args[]) throws IOException{
          frequencyeach obj= new frequencyeach();
           obj.getvalue();
           obj.count();

 }
}
